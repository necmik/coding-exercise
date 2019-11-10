package com.coding.designpatterns.factory;

public enum KnifeType {
	STEAK("steak"), CHEFS("chefs");
	
	private String value;
	
	private KnifeType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
