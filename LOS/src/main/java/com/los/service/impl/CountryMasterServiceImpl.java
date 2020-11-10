package com.los.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.los.model.CountryMaster;
import com.los.repository.CountryRepository;
import com.los.response.ApiBaseResponse;
import com.los.response.RecordNotFoundException;
import com.los.service.CountryMasterService;

@Service
public class CountryMasterServiceImpl implements CountryMasterService {

	@Autowired
	CountryRepository countryRepository;

	@Override
	public List<CountryMaster> getAllCountry() {
		return countryRepository.findAll();
	}

	@Override
	public CountryMaster getCountrybyId(Long id) {
		Optional<CountryMaster> findById = countryRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		} else {
			return null;
		}
	}

	@Override
	public void deletCountrybyId(Long id) throws RecordNotFoundException {
		Optional<CountryMaster> findById = countryRepository.findById(id);
		if (findById.isPresent()) {
			countryRepository.deleteById(id);

		} else {
			throw new RecordNotFoundException("Id Not Found");
		}
	}

	public CountryMaster UpdateorCreate(CountryMaster country) throws RecordNotFoundException {
		Optional<CountryMaster> findById = countryRepository.findById(country.getId());

		if (findById.isPresent()) {

			CountryMaster newCountry = findById.get();
			newCountry.setCountryCode(country.getCountryCode());
			//newCountry.setCountryName(country.getCountryName());
			String upperCountry = country.getCountryName().toUpperCase();
			newCountry.setCountryName(upperCountry);
			//newCountry.setStatemaster(country.getStatemaster());
			newCountry = countryRepository.save(newCountry);
			return newCountry;
		} else {

			return countryRepository.save(country);

		}
	}

//	public ApiBaseResponse<?> register(CountryMaster countryMaster) {
//		ApiBaseResponse apiBaseResponse = new ApiBaseResponse();
//		try {
//		CountryMaster countrymaster = new CountryMaster(countryMaster.getId(),
//	  countryMaster.getCountryName(),countryMaster.getCountryCode());
//       CountryMaster saveCountry =countryRepository.save(countrymaster);
//        apiBaseResponse.setData(saveCountry);
//        
//       
//		apiBaseResponse.getResponseDto().setResponseCode(201);
//		apiBaseResponse.getResponseDto().setResponseDescription(
//				"User Registered Sucessfully");
//
//	} catch (Exception ex) {
//		apiBaseResponse.getResponseDto().setExceptionCode(234);
//		apiBaseResponse.getResponseDto().setExceptionDescription(
//				"Exception occured");
//	
//	}
//		return apiBaseResponse;
//
//	}

}
