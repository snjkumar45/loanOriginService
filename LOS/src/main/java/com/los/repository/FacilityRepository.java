package com.los.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.los.model.FacilityMaster;

@Repository
public interface FacilityRepository extends JpaRepository<FacilityMaster, Long>{

	Optional<FacilityMaster> findById (Long Id);
	
	//UserMaster findByBranch(String branchCode);
	
}