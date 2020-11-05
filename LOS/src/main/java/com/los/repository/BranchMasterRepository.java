package com.los.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.los.model.BranchMaster;

@Repository
public interface BranchMasterRepository extends JpaRepository<BranchMaster, Long> {

	//BranchMaster findByLoginId(String loginId);

	//BranchMaster findByBranchCode(long branchCode);
	// BranchMaster findByBranch(String branchCode);

}
