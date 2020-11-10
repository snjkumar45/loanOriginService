package com.los.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.los.model.StateMaster;
import com.los.repository.StateRepository;
import com.los.response.RecordNotFoundException;
import com.los.service.StateMasterService;

@Service
  public class StateMasterServiceImpl implements StateMasterService {
@Autowired	
	  StateRepository repository;

	@Override
	public List<StateMaster> getAllState() {
		List<StateMaster> State = repository.findAll();
		return State;	
	}

	@Override
	public StateMaster getStatebyId(Long id) throws Exception {
		Optional<StateMaster> find =repository.findById(id);
		if(find.isPresent()) {
		return	find.get();
		}else {
			throw new RecordNotFoundException("Id Not Found");
		}
	}

	@Override
	public void deletStatebyId(Long id) throws Exception {
		Optional<StateMaster> find = repository.findById(id);
		if (find.isPresent()) {
			repository.deleteById(id);

		} else {
			throw new RecordNotFoundException("Id Not Found");
		}
		
	}

	@Override
	public StateMaster UpdateorCreate(StateMaster state) throws RecordNotFoundException {
		Optional<StateMaster> find= repository.findById(state.getId());
		if(find.isPresent()) {
			StateMaster newState=find.get();
			newState.setStateName(state.getStateName());
			newState.setStateCode(state.getStateCode());
			newState.setCountrymaster(state.getCountrymaster());
			newState=repository.save(newState);
			return newState;
		}else
		{
		return repository.save(state);	
		}
		
		
	}

	

}
