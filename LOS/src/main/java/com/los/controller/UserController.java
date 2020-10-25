package com.los.controller;

import io.swagger.annotations.ApiOperation;

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

import com.los.dto.UserMasterDto;
import com.los.model.UserMaster;
import com.los.response.ApiBaseResponse;
import com.los.service.UserMasterService;
import com.los.utility.Utility;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

	public static final org.apache.logging.log4j.Logger logger = LogManager
			.getLogger(UserController.class);

	@Autowired
	private UserMasterService userMasterService;
	
	
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "get users in calonex system", notes = "API to get users in calonex system")
	@GetMapping("/users")
	
	public List getAllUsers() {
		List < UserMaster > userList = null;
		try{
		userList = userMasterService.getAllUsers();
		logger.info("getting user list");
		
		}catch(Exception e){
			logger.error("error while getting user list" + e);
		}
		
		return userList;
		
	}

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "save users in calonex system", notes = "API to save users in calonex system")
	@PostMapping("/registration")
	public ResponseEntity<ApiBaseResponse> registerUserAccount(
			@RequestBody UserMasterDto userdto) {
		ApiBaseResponse apiBaseResponse = null;

		logger.info("Registering user account with userName:"
				+ Utility.objectToJson(userdto));
		try {
			apiBaseResponse = userMasterService.registerUser(userdto);
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
