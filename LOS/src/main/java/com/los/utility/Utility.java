package com.los.utility;

import org.apache.logging.log4j.LogManager;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {

	public static final org.apache.logging.log4j.Logger logger = LogManager
			.getLogger(Utility.class);

	public static String objectToJson(Object tragetObject) {
		String res = "";
		if (tragetObject == null)
			return null;
		ObjectMapper mapper = new ObjectMapper();
		// Converting the Object to JSONStringO
		try {
			res = mapper.writeValueAsString(tragetObject);
		} catch (Exception e) {
			logger.info("catching exception occured in objectToJson method and the reason is : "
					+ e);
			e.printStackTrace();
		}
		return res;
	}
}
