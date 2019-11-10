package com.coding.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Apple {
	private String color;
	private int weight;
	
	public Apple() {
		super();
	}
	
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
		
		newList = filterApples(list, (a) -> a.getWeight() > 160);
		for (Apple apple : newList) {
			System.out.println(apple.getColor() + ","+ apple.getWeight());
		}
		
		list.sort((Apple a1, Apple a2) -> Integer.valueOf(a1.getWeight()).compareTo(a2.getWeight()));
		
		list.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor)); //Method reference
		
		Supplier<Apple> c1 = Apple::new;
		Apple a1 = c1.get();
		
		BiFunction<String, Integer, Apple> c3 = Apple::new;
		Apple a3 = c3.apply("green", 110);
		
		
	}
	
}
