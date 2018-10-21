package com.coding.java8;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private String color;
	private int weight;
	
	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple:inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<Apple> list = new ArrayList<>();
		list.add(new Apple("green", 140));
		list.add(new Apple("green", 160));
		list.add(new Apple("blue", 170));
		list.add(new Apple("black", 150));
		list.add(new Apple("green", 155));
		
		List<Apple> newList = filterApples(list, Apple::isGreenApple);
		for (Apple apple : newList) {
			System.out.println(apple.getColor() + ","+ apple.getWeight());
		}
		
		newList = filterApples(list, (a)->a.getWeight() > 160);
		for (Apple apple : newList) {
			System.out.println(apple.getColor() + ","+ apple.getWeight());
		}
	}
	
}
