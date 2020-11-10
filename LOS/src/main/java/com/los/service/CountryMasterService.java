package com.los.service;
 import java.util.List;
 import com.los.response.ApiBaseResponse;
import com.los.response.RecordNotFoundException;

import com.los.model.CountryMaster;


public interface CountryMasterService {
	
	public List<CountryMaster> getAllCountry();
	public CountryMaster getCountrybyId(Long id);
	public void deletCountrybyId(Long id) throws Exception;
	//public ApiBaseResponse<?> register(CountryMaster countryMaster)T;
public CountryMaster UpdateorCreate(CountryMaster country)throws RecordNotFoundException;
}
