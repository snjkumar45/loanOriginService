package com.los.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.los.model.CountryMaster;
import com.los.response.ApiBaseResponse;
import com.los.response.RecordNotFoundException;
import com.los.service.CountryMasterService;
import com.los.utility.Utility;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.service.Header;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CountryController {

	public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(CountryController.class);

	@Autowired
	private CountryMasterService countryMasterService;

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "get users in country system", notes = "API to get country system")
	@GetMapping("/country")

	public List getAllUsers() {
		List<CountryMaster> countryList = null;
		try {
			countryList = countryMasterService.getAllCountry();
			logger.info("getting country list");

		} catch (Exception e) {
			logger.error("error while getting country list" + e);
		}

		return countryList;

	}

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "save country Data", notes = "API to save country in system")
	@PostMapping("/countryregistration")
	public ResponseEntity<CountryMaster> UpdateorCreate(CountryMaster country) throws RecordNotFoundException {
		CountryMaster updated = countryMasterService.UpdateorCreate(country);
		return new ResponseEntity<CountryMaster>(updated, new HttpHeaders(), HttpStatus.OK);

	}

//	@SuppressWarnings("rawtypes")
//	@ApiOperation(value = "save country Data", notes = "API to save country in system")
//	@PostMapping("/countryregistration")
//	public ResponseEntity<ApiBaseResponse> registerUserAccount(
//			@RequestBody CountryMaster country) {
//		ApiBaseResponse apiBaseResponse = null;
//
//		logger.info("Registering country account with country:"
//				+ Utility.objectToJson(country));
//		try {
//			apiBaseResponse = countryMasterService.register(country);
//			logger.info("registration to test is complete");
//		} catch (Exception e) {
//			logger.error("error in country registration" + e);
//		}
//
//		if (null == apiBaseResponse) {
//			return new ResponseEntity<ApiBaseResponse>(apiBaseResponse,
//					HttpStatus.BAD_REQUEST);
//		} else if (apiBaseResponse.getResponseDto().getExceptionCode() == 0) {
//
//			return new ResponseEntity<ApiBaseResponse>(apiBaseResponse,
//					HttpStatus.CREATED);
//		} else {
//
//			return new ResponseEntity<ApiBaseResponse>(apiBaseResponse,
//					HttpStatus.BAD_REQUEST);
//		}
//	}

	@DeleteMapping("/country/{id}")
	public HttpStatus deleteCountorybyId(@PathVariable("id") Long id) {
		try {
			countryMasterService.deletCountrybyId(id);
			return HttpStatus.OK;

		} catch (Exception e) {
			logger.error("Id Not Found" + e);
			return HttpStatus.NOT_FOUND;
		}

	}

}