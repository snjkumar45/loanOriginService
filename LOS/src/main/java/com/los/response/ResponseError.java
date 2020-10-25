package com.los.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author: Poonam
 * 
 */

@SuppressWarnings("unlikely-arg-type")
public enum ResponseError {

	ENTITY_SAVE_ERROR(0, "Error during saving entity"), INTERNAL_ERROR(1, "Some internal error occurred"),
	NO_ERROR(2, "No error"), API_VALIDATION_ERROR(3, "API validation error"), REQUEST_NOT_VALID(4, "Request not valid"),
	REQUEST_NOT_PROCESSABLE(5, "Request not valid");

	int code;
	String description;

	private ResponseError(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public static boolean isValidateCode(String code) {
		Set<Integer> codeSet = Stream.of(values()).map(ResponseError::getCode).collect(Collectors.toSet());
		return codeSet.contains(code);
	}

	public static List<Map<String, Object>> enumToMap() {
		List<Map<String, Object>> enumData = new ArrayList<Map<String, Object>>();
		Stream.of(values()).forEach(o -> {
			enumData.add(new HashMap<String, Object>() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 3988268110223294027L;

				{
					put("code", o.code);
					put("description", o.description);
				}
			});
		});
		return enumData;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
