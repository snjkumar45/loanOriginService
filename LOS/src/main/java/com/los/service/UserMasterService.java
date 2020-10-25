package com.los.service;

import java.util.List;

import com.los.dto.UserMasterDto;
import com.los.model.UserMaster;
import com.los.response.ApiBaseResponse;

public interface UserMasterService {

	public List<UserMaster> getAllUsers();
	
	public UserMaster getUserById(Long id);
	
	public UserMaster deleteUserById(Long id);
	
	public ApiBaseResponse<?> registerUser(UserMasterDto userMasterDto);
	
}
