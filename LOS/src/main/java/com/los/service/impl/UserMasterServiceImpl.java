package com.los.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.los.dto.UserMasterDto;
import com.los.model.UserMaster;
import com.los.repository.UserRepository;
import com.los.response.ApiBaseResponse;
import com.los.service.UserMasterService;

@Service
public class UserMasterServiceImpl implements UserMasterService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserMaster> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserMaster getUserById(Long id) {
		Optional<UserMaster> findById = userRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		} else {
			return null;
		}
	}

	@Override
	public UserMaster deleteUserById(Long id) {
		return null;
	}

	@Override
	public ApiBaseResponse<?> registerUser(UserMasterDto userMasterDto) {
		ApiBaseResponse<?> apiBaseResponse = new ApiBaseResponse();
		try {
			UserMaster userMaster = new UserMaster(
					StringUtils.isEmpty(userMasterDto.getId()) != true ? Long.parseLong(userMasterDto.getId()) : null,
					userMasterDto.getLoginId(), userMasterDto.getFirstName(), userMasterDto.getLastName(),
					userMasterDto.getEmailId(), userMasterDto.getMobileNo(), userMasterDto.getActiveStatus(),
					Boolean.parseBoolean(userMasterDto.getIsAdmin()),
					Boolean.parseBoolean(userMasterDto.getAutoLogin()),
					Boolean.parseBoolean(userMasterDto.getSsoLogin()), userMasterDto.getBranchCode());

			UserMaster saveUser = userRepository.save(userMaster);
			apiBaseResponse.setData(saveUser);
			apiBaseResponse.getResponseDto().setResponseCode(201);
			apiBaseResponse.getResponseDto().setResponseDescription("User Registered Sucessfully");

		} catch (Exception ex) {
			apiBaseResponse.getResponseDto().setExceptionCode(234);
			apiBaseResponse.getResponseDto().setExceptionDescription("Exception occured");
		}
		return apiBaseResponse;
	}

}
