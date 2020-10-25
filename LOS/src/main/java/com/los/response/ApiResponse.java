package com.los.response;


/**
 * @author: Poonam
 * 
 */


public class ApiResponse<T> extends AbstractResponse {
	private boolean success;
	private Response oldData;
	private T data;
	private ApiResponseError error;
	private ResponseDto responseDto;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Response getOldData() {
		return oldData;
	}

	public void setOldData(Response oldData) {
		this.oldData = oldData;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ApiResponseError getError() {
		return error;
	}

	public void setError(ApiResponseError error) {
		this.error = error;
	}

	public ResponseDto getResponseDto() {
		return responseDto;
	}

	public void setResponseDto(ResponseDto responseDto) {
		this.responseDto = responseDto;
	}

}
