package com.coding.designpatterns.template;

public class PenneAlfredo extends PastaDish {

	@Override
	void addPasta() {
		System.out.println("Add penne");

	}

	@Override
	void addSauce() {
		System.out.println("Add Alfredo sauce");
	}

	@Override
	void addProtein() {
		System.out.println("Add chicken");
	}

	@Override
	void addGarnish() {
		System.out.println("Add parsley");
	}

}
