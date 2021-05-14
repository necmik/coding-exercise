package com.coding.exceptionhandling;

public class InvalidCustomerInfoException extends Exception{
	public InvalidCustomerInfoException(String message) {
		super(message);
	}
}
