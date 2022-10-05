package com.AbcLoan.app.exceptionHandling;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(CustomerNotFoundException.class)
  public ResponseEntity<ResponseError>customerNotFoundExceptionHandler(CustomerNotFoundException c,HttpServletRequest request)
  {
	  ResponseError error=new ResponseError(HttpStatus.NOT_FOUND.value(),c.getMessage(),HttpStatus.NOT_FOUND,new Date(),request.getRequestURI());
	  return new ResponseEntity<ResponseError>(error,HttpStatus.NOT_FOUND);
  }
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> ArithmaticExceptionHandler(ArithmeticException e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
    
	@ExceptionHandler(handleAllException.class)
	public final ResponseEntity<ResponseError> handleAllException(Exception exception,WebRequest request,handleAllException h)
	{
		 ResponseError error=new ResponseError(HttpStatus.NOT_FOUND.value(),h.getMessage(),HttpStatus.NOT_FOUND,new Date(), null);
	  return new ResponseEntity<ResponseError>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
