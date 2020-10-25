package com.los.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_NULL)
public class ResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	/** The response code. */
	private int responseCode;
	/** The response description. */
	private String responseDescription;
	/** The exception code. */
	private int exceptionCode;
	/** The exception description. */
	private String exceptionDescription;
	private Integer status;
	private String Message;
	private String testRole;
	private String testStataus;

	public String getTestRole() {
		return testRole;
	}

	public void setTestRole(String testRole) {
		this.testRole = testRole;
	}

	public String getTestStataus() {
		return testStataus;
	}

	public void setTestStataus(String testStataus) {
		this.testStataus = testStataus;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	/**
	 * Instantiates a new response dto.
	 *
	 * @param responseCode        the response code
	 * @param responseDescription the response description
	 */

	public ResponseDto() {
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public ResponseDto(int responseCode, String responseDescription) {
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public int getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getExceptionDescription() {
		return exceptionDescription;
	}

	public void setExceptionDescription(String exceptionDescription) {
		this.exceptionDescription = exceptionDescription;
	}

}