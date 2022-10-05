package com.AbcLoan.app.exceptionHandling;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseError 
{
	private Integer statuscode;
	private String msg;
	private HttpStatus httpStatus;
	private Date date;
	private String path;
	

}
