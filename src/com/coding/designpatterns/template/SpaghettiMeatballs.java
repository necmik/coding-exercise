package com.coding.designpatterns.template;

public class SpaghettiMeatballs extends PastaDish {

	@Override
	void addPasta() {
		System.out.println("Add spaghetti");

	}

	@Override
	void addSauce() {
		System.out.println("Add tomato sauce");
	}

	@Override
	void addProtein() {
		System.out.println("Add meatballs");
	}

	@Override
	void addGarnish() {
		System.out.println("Add parmesan cheese");
	}

}
