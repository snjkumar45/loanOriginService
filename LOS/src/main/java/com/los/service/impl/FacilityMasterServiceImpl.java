package com.los.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.los.dto.FacilityMasterDto;
import com.los.model.FacilityMaster;
import com.los.repository.FacilityRepository;
import com.los.response.ApiBaseResponse;
import com.los.service.FacilityMasterService;


@Service
@SuppressWarnings({ "rawtypes", "unchecked" })
public class FacilityMasterServiceImpl implements FacilityMasterService {

	@Autowired
	private FacilityRepository facilityRepository;

	@Override
	public List<FacilityMaster> getAllFacilityMasters() {
		// TODO Auto-generated method stub
		return facilityRepository.findAll();
	}

	@Override
	public FacilityMaster getFacilityMasterById(Long id) { 
		Optional<FacilityMaster> findById = facilityRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		} else {
			return null;
		}
	}

	@Override
	public FacilityMaster deleteFacilityMasterById(Long id) {
		
		return null;
	}
	@Override
	 public ApiBaseResponse<?> add(FacilityMasterDto facilityMasterDto) {
		ApiBaseResponse apiBaseResponse = new ApiBaseResponse();
		try {
			FacilityMaster facilityMaster = new FacilityMaster
					(StringUtils.isEmpty(facilityMasterDto.getId()) != true 
					? Long.parseLong(facilityMasterDto.getId()) : null,
							facilityMasterDto.getActiveStatus(),facilityMasterDto.getCaplimit(),
							facilityMasterDto.getCapUtilized(),facilityMasterDto.getEffectiveFrom(),facilityMasterDto.getEffectiveTill(),
							facilityMasterDto.getFacilityCode(),facilityMasterDto.getFacilityType(),
							facilityMasterDto.getLoanType(),facilityMasterDto.getThresholdLimit());

			facilityMaster = facilityRepository.save(facilityMaster);
			apiBaseResponse.setData(facilityMaster);
			apiBaseResponse.getResponseDto().setResponseCode(201);
			apiBaseResponse.getResponseDto().setResponseDescription("Facility Registered Sucessfully");

		} catch (Exception ex) {
			apiBaseResponse.getResponseDto().setExceptionCode(234);
			apiBaseResponse.getResponseDto().setExceptionDescription("Exception occured");
		}
		return apiBaseResponse;
	}
	}