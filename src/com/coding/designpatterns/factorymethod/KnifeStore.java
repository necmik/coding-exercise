package com.coding.designpatterns.factorymethod;

import com.coding.designpatterns.factory.Knife;
import com.coding.designpatterns.factory.KnifeType;

public abstract class KnifeStore {

	public Knife orderKnife(KnifeType knifeType) {
		Knife knife = createKnife(knifeType);
		knife.sharpen();
		knife.polish();
		return knife;
	}
	
	abstract Knife createKnife(KnifeType knifeType);
}
