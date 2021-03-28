package com.coding.inheritance;

public class Food extends Product {
	
	private String category;

	public Food(String category) {
		super(category, 1.99);
		this.category = category;
		System.out.println("food constructor");
	}

	public String getCategory() {
		return category;
	}
	
	@Override
	public int getId() {
		return 1;
	}
}
