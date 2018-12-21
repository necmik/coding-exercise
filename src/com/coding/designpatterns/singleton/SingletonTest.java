package com.coding.designpatterns.singleton;

public class SingletonTest {

	private SingletonTest instance;
	
	private SingletonTest() {
		
	}
	
	public SingletonTest getInstance() {
		if (null == instance) {
			synchronized (this) {
				if (null == instance) {
					instance = new SingletonTest();
				}
			}
		}
		return instance;
	}
}
