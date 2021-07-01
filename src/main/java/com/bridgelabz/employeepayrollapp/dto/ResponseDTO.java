package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;

public class ResponseDTO {
	private String message;
	private Object data;

	public ResponseDTO(String message, Object data) {
		this.message = message;
		this.data = data;
	}
}