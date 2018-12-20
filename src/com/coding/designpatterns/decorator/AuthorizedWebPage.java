package com.coding.designpatterns.decorator;

public class AuthorizedWebPage extends WebPageDecorator {

	public AuthorizedWebPage(WebPage webPage) {
		super(webPage);
	}
	
	public void authorizedUser() {
		System.out.println("Authorizing user");
	}
	
	public void display() {
		super.display();
		this.authorizedUser();
	}

}
