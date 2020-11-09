package com.los.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.los.dto.FacilityMasterDto;
import com.los.model.FacilityMaster;
import com.los.response.ApiBaseResponse;
import com.los.service.FacilityMasterService;
import com.los.utility.Utility;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FacilityController {

	public FacilityController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static final org.apache.logging.log4j.Logger logger = LogManager
			.getLogger(FacilityController.class);

	@Autowired
	private FacilityMasterService facilityMasterService;
	
	
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "get facility in calonex system", notes = "API to get facility in calonex system")
	@GetMapping("/facility")
	
	public List getAllFacilityMasters() {
		List < FacilityMaster > facilityList = null;
		try{
		facilityList = facilityMasterService.getAllFacilityMasters();
		logger.info("getting facility list");
		
		}catch(Exception e){
			logger.error("error while getting facility list" + e);
		}
		
		return facilityList;
		
	}

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "save facility in calonex system", notes = "API to save facility in calonex system")
	@PostMapping("/register")
	public ResponseEntity<ApiBaseResponse> add(
			@RequestBody FacilityMasterDto facilityMasterDto) {
		ApiBaseResponse apiBaseResponse = null;

		logger.info("Registering facility account with facilityName:"
				+ Utility.objectToJson(facilityMasterDto));
		try {
			apiBaseResponse = facilityMasterService.add(facilityMasterDto);
			logger.info("registration to test is complete");
		} catch (Exception e) {
			logger.error("error in registration" + e);
		}

		if (null == apiBaseResponse) {
			return new ResponseEntity<ApiBaseResponse>(apiBaseResponse,
					HttpStatus.BAD_REQUEST);
		} else if (apiBaseResponse.getResponseDto().getExceptionCode() == 0) {

			return new ResponseEntity<ApiBaseResponse>(apiBaseResponse,
					HttpStatus.OK);
		} else {

			return new ResponseEntity<ApiBaseResponse>(apiBaseResponse,
					HttpStatus.BAD_REQUEST);
		}

	}

}