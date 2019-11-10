package com.coding.designpatterns.decorator;

public class BasicWebPage implements WebPage {

	public String html = "...";
	public String styleSheet = "...";
	public String script = "...";
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		//Renders the HTML to the stylesheet, and run any embedded scripts
	}

}
