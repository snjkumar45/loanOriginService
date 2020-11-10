package com.los.service;

import java.util.List;

import com.los.model.CityMaster;
import com.los.response.RecordNotFoundException;

public interface CityMasterService {
	public List<CityMaster> getAllCity();
	public CityMaster getCitybyId(Long id) throws Exception;
	public void deletCitybyId(Long id) throws Exception;
public CityMaster UpdateorCreate(CityMaster city)throws RecordNotFoundException;

}
