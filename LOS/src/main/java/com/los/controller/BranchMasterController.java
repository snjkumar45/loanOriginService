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

import com.los.dto.BranchMasterDto;
import com.los.model.BranchMaster;
import com.los.response.ApiBaseResponse;
import com.los.service.BranchMasterService;
import com.los.utility.Utility;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BranchMasterController {

	public static final org.apache.logging.log4j.Logger logger = LogManager
			.getLogger(BranchMasterController.class);

	@Autowired
	private BranchMasterService branchMasterService;
	
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "get users in calonex system", notes = "API to get users in calonex system")
	@GetMapping("/GetAllUser")
	
	public List getAllUsers() {
		List<BranchMaster> userList = null;
		try{
		userList = branchMasterService.getAllUsers();
		logger.info("getting user list");
		
		}catch(Exception e){
			logger.error("error while getting user list" + e);
		}
		
		return userList;
		
	}

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "save Branches in los  system", notes = "API to save Branches in los system")
	@PostMapping("/Add")
	public ResponseEntity<ApiBaseResponse> registerUserAccount(
			@RequestBody BranchMasterDto branchMasterDto) {
		ApiBaseResponse apiBaseResponse = null;

		try {
			apiBaseResponse = branchMasterService.registerBranch(branchMasterDto);
			logger.info("registration to Branch is complete");
		} catch (Exception e) {
			logger.error("error in registration branch" + e);
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
