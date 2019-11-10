package com.coding.designpatterns.decorator;

public class AuthenticatedWebPage extends WebPageDecorator {

	public AuthenticatedWebPage(WebPage webPage) {
		super(webPage);
	}
	
	public void authenticateUser() {
		System.out.println("Authenticating user");
	}
	
	public void display() {
		super.display();
		this.authenticateUser();
	}

}
