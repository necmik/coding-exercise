package com.coding.designpatterns.factory;

public class KnifeFactory {

	public Knife createKnife(KnifeType knifeType) {
		Knife knife = null;
		
		if (knifeType.equals(KnifeType.STEAK)) {
			knife = new SteakKnife();
			System.out.println("Steak Knife created");
		} else if (knifeType.equals(KnifeType.CHEFS)) {
			knife = new ChefsKnife();
			System.out.println("Chefs Knife created");
		}
		
		return knife;
	}
}
