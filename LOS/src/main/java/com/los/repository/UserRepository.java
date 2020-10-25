package com.los.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.los.model.UserMaster;

@Repository
public interface UserRepository extends JpaRepository<UserMaster, Long>{

	UserMaster findByloginId(String loginId);
	UserMaster findByEmailId(String emailId);
	//UserMaster findByBranch(String branchCode);
	
}
