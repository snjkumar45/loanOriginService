package com.los.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.los.model.StateMaster;
import com.los.response.RecordNotFoundException;


public interface StateMasterService {
	public List<StateMaster> getAllState();
	public StateMaster getStatebyId(Long id) throws Exception;
	public void deletStatebyId(Long id) throws Exception;
public StateMaster UpdateorCreate(StateMaster state)throws RecordNotFoundException;

}
