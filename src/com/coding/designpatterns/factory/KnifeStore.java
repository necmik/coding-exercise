package com.coding.designpatterns.factory;

public class KnifeStore {
	private KnifeFactory factory;
	
	public KnifeStore(KnifeFactory factory) {
		this.factory = factory;
	}
	
	public Knife createKnife(KnifeType knifeType) {
		Knife knife = factory.createKnife(knifeType);
		
		knife.sharpen();
		knife.polish();
		
		return knife;
	}
	
	public static void main(String[] args) {
		KnifeStore store = new KnifeStore(new KnifeFactory());
		
		store.createKnife(KnifeType.CHEFS);
		store.createKnife(KnifeType.STEAK);
	}
}
