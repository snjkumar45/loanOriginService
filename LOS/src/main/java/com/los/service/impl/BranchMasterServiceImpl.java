package com.los.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.los.dto.BranchMasterDto;
 
import com.los.model.BranchHolidays;
import com.los.model.BranchMaster;
import com.los.model.BranchTimings;
import com.los.model.CommunicationDetails;
import com.los.repository.BranchMasterRepository;
import com.los.response.ApiBaseResponse;
import com.los.service.BranchMasterService;

@Service
public class BranchMasterServiceImpl implements BranchMasterService {

	@Autowired
	private BranchMasterRepository branchMasterRepository;

	@Override
	public List<BranchMaster> getAllUsers() {
		return branchMasterRepository.findAll();
	}

	@Override
	public BranchMaster getUserById(Long id) {
		Optional<BranchMaster> findById = branchMasterRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		} else {
			return null;
		}
	}

	@Override
	public BranchMaster deleteUserById(Long id) {
		return null;
	}

	@Override
	public ApiBaseResponse<?> registerBranch(BranchMasterDto branchMasterDto) {

		@SuppressWarnings("rawtypes")
		ApiBaseResponse apiBaseResponse = new ApiBaseResponse();

		try {
			BranchMaster branchMaster = new BranchMaster();
			branchMaster.setAddress(branchMasterDto.getAddress());
			
			 
			
			CommunicationDetails communicationDetails = new CommunicationDetails();
			if (branchMasterDto.getCommunicationDetails() != null && !StringUtils.isEmpty(branchMasterDto.getCommunicationDetails().getId()))
				communicationDetails.setId(Long.parseLong(branchMasterDto.getCommunicationDetails().getId()));
			communicationDetails.setFaxNumber(branchMasterDto.getCommunicationDetails().getFaxNumber());
			communicationDetails.setSwiftAddress(branchMasterDto.getCommunicationDetails().getSwiftAddress());
			communicationDetails.setTelephone(branchMasterDto.getCommunicationDetails().getTelephone());
			branchMaster.setCommunicationDetails(communicationDetails);
			
			BranchTimings branchTimings = new BranchTimings();
			if (branchMasterDto.getBranchTimings() != null && !StringUtils.isEmpty(branchMasterDto.getBranchTimings().getId()))
			branchTimings.setId(Long.parseLong(branchMasterDto.getBranchTimings().getId()));
			branchTimings.setBranchTimingFrom(branchMasterDto.getBranchTimings().getBranchTimingFrom());
			branchTimings.setBranchTimingTo(branchMasterDto.getBranchTimings().getBranchTimingTo());
			branchMaster.setBranchTimings(branchTimings);
			
			
			BranchHolidays branchHolidays = new BranchHolidays();
			if (branchMasterDto.getBranchHolidays() != null && !StringUtils.isEmpty(branchMasterDto.getBranchHolidays().getId()))
			branchHolidays.setId(Long.parseLong(branchMasterDto.getBranchHolidays().getId()));
			branchHolidays.setWeekHalfDays(branchMasterDto.getBranchHolidays().getWeekHalfDays());
			branchHolidays.setWeeklyOff(branchMasterDto.getBranchHolidays().getWeeklyOff());
			branchMaster.setBranchHolidays(branchHolidays);
			
			BranchMaster saveUser = branchMasterRepository.save(branchMaster);
			apiBaseResponse.setData(saveUser);
			apiBaseResponse.getResponseDto().setResponseCode(201);
			apiBaseResponse.getResponseDto().setResponseDescription("Branch Registered Sucessfully");

		} catch (Exception ex) {
			apiBaseResponse.getResponseDto().setExceptionCode(234);
			apiBaseResponse.getResponseDto().setExceptionDescription("Exception occured");
			ex.printStackTrace();
			System.out.println(ex);
		}
		return apiBaseResponse;

	}

}
