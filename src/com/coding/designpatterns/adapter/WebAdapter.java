package com.coding.designpatterns.adapter;

import javax.jws.WebService;

public class WebAdapter implements WebRequester {

	private WebService service;
	
	public void connect(WebService currentService) {
		this.service = currentService;
	}
	
	@Override
	public int request(Object request) {
		JSONObject result = toJson(request);
		//JSONObject response = service.request(result);
		return 200;
	}
	
	private JSONObject toJson(Object input) {
		//TODO
		return new JSONObject();
	}

}
