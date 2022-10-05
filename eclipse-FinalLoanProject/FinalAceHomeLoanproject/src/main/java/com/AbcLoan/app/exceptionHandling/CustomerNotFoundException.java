package com.AbcLoan.app.exceptionHandling;

public class CustomerNotFoundException extends RuntimeException
{
	 public CustomerNotFoundException(String msg)
	 {
		 super(msg);
	 }

}
