package com.los.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author: Sudhir
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_NULL)
public class ApiBaseResponse<T> implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The response dto. */
	private ResponseDto responseDto;
	/** The Data to be send to UI */
	private T data;

	public ApiBaseResponse() {
		super();
		this.responseDto = new ResponseDto();
	}

	public ApiBaseResponse(ResponseDto responseDto) {
		super();
		this.responseDto = responseDto;
	}

	public ApiBaseResponse(ResponseDto responseDto, T data) {
		super();
		this.responseDto = responseDto;
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResponseDto getResponseDto() {
		return responseDto;
	}

	public void setResponseDto(ResponseDto responseDto) {
		this.responseDto = responseDto;
	}
}
