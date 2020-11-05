package com.los.service;

import java.util.List;

import com.los.dto.BranchMasterDto;
import com.los.model.BranchMaster;
import com.los.response.ApiBaseResponse;

public interface BranchMasterService {

	public List<BranchMaster> getAllUsers();
	
	public BranchMaster getUserById(Long id);
	
	public BranchMaster deleteUserById(Long id);
	
	public ApiBaseResponse<?> registerBranch(BranchMasterDto branchMasterDto);
	
}
