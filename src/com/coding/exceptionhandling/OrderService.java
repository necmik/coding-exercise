package com.coding.exceptionhandling;

public class OrderService {

	private static final int ORDER_SUCCESS = 0;
	
	public OrderResponse Order(OrderRequest request) throws InvalidCustomerInfoException, InvalidItemInfoException {
		if (request.getCustomerId() == null) {
			throw new InvalidCustomerInfoException("customerId can not be null");
		}
		
		if (request.getItemId() == null) {
			throw new InvalidItemInfoException("itemId can not be null");
		}
		
		//process order
		
		OrderResponse response = new OrderResponse();
		response.setStatus(ORDER_SUCCESS);
		return response;
	}
}
