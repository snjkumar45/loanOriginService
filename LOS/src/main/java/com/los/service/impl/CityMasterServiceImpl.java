package com.los.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.los.model.CityMaster;
import com.los.model.StateMaster;
import com.los.repository.CityRepository;
import com.los.response.RecordNotFoundException;
import com.los.service.CityMasterService;

@Service
public class CityMasterServiceImpl implements CityMasterService {
	@Autowired
CityRepository repo;
	@Override
	public List<CityMaster> getAllCity() {
		List<CityMaster> city = repo.findAll();
		return city;
	}

	@Override
	public CityMaster getCitybyId(Long id)throws Exception {
Optional<CityMaster> find =repo.findById(id);
if(find.isPresent()) {
	return find.get();
	
}
else {
throw new RecordNotFoundException("Id Not Found");
	}
	}
	@Override
	public void deletCitybyId(Long id) throws Exception {
		Optional<CityMaster> find =repo.findById(id);
		if(find.isPresent()) {
	repo.deleteById(id);
			
		}
		else {
		throw new RecordNotFoundException("Id Not Found");
			}		
	}

	@Override
	public CityMaster UpdateorCreate(CityMaster city) throws RecordNotFoundException
	{
		Optional<CityMaster> find= repo.findById(city.getId());
		if(find.isPresent()) {
			CityMaster newCity=find.get();
			newCity.setCityCode(city.getCityName());
			newCity.setCityCode(city.getCityCode());
			newCity.setStateMaster(city.getStateMaster());
			newCity=repo.save(newCity);
			return newCity;
		}else
		{
		return repo.save(city);					
	}
	}
}