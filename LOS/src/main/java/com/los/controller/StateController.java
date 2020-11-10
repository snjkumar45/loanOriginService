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

import com.los.model.StateMaster;
import com.los.response.RecordNotFoundException;
import com.los.service.StateMasterService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class StateController {
	public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(StateController.class);

@Autowired
private StateMasterService  stateMasterService;

@SuppressWarnings("rawtypes")
@ApiOperation(value = "save country Data", notes = "API to save country in system")
@PostMapping("/stateregistration")
public ResponseEntity<StateMaster> UpdateorCreate(StateMaster state) throws RecordNotFoundException {
	StateMaster updated = stateMasterService.UpdateorCreate(state);
	return new ResponseEntity<StateMaster>(updated, new HttpHeaders(), HttpStatus.OK);

}


}
