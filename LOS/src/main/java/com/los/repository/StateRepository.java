package com.los.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.los.model.StateMaster;

@Repository
public interface StateRepository extends JpaRepository<StateMaster , Long>{

}
