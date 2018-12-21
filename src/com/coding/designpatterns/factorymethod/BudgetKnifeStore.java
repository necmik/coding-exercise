package com.coding.designpatterns.factorymethod;

import com.coding.designpatterns.factory.ChefsKnife;
import com.coding.designpatterns.factory.Knife;
import com.coding.designpatterns.factory.KnifeType;
import com.coding.designpatterns.factory.SteakKnife;

public class BudgetKnifeStore extends KnifeStore {

	@Override
	Knife createKnife(KnifeType knifeType) {
		if (knifeType.equals(KnifeType.STEAK)) {
			System.out.println("Steak Knife created");
			return new SteakKnife();
		} else if (knifeType.equals(KnifeType.CHEFS)) {
			System.out.println("Chefs Knife created");
			return new ChefsKnife();
		}
		return null;
	}

}
