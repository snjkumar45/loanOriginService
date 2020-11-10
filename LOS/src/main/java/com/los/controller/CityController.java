package com.los.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.los.model.CityMaster;
import com.los.response.RecordNotFoundException;
import com.los.service.impl.CityMasterServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CityController {
	public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(StateController.class);
 @Autowired
	CityMasterServiceImpl cityService;
 
 @SuppressWarnings("rawtypes")
 @ApiOperation(value = "save City Data", notes = "API to save City in system")
 @PostMapping("/cityregistration")
 public ResponseEntity<CityMaster> UpdateorCreate(CityMaster city) throws RecordNotFoundException {
		CityMaster updated = cityService.UpdateorCreate(city);
		return new ResponseEntity<CityMaster>(updated, new HttpHeaders(), HttpStatus.OK);


}
}