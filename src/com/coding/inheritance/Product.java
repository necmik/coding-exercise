package com.coding.inheritance;

public class Product {

	private String name;
	
	private double price;
	
	public Product(String name, double price) {
		System.out.println("Product constructor(name, price)");
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
}
