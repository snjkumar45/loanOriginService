package com.los.service;

import java.util.List;

import com.los.dto.FacilityMasterDto;
import com.los.model.FacilityMaster;
import com.los.response.ApiBaseResponse;

public interface FacilityMasterService {
	
	public List<FacilityMaster> getAllFacilityMasters();
	
	public FacilityMaster getFacilityMasterById(Long id);
		
	public FacilityMaster deleteFacilityMasterById(Long id);
	
	public ApiBaseResponse<?> add(FacilityMasterDto facilityMasterDto);

	

}

	
	


	
	


