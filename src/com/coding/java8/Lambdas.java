package com.coding.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {

	public static void main(String[] args) {
		String s = "ABDC";
		//(String s) -> s.length();
		
		Predicate<String> nonEmptyStringPredicate = (str) -> !s.isEmpty();
		System.out.println(nonEmptyStringPredicate.test("AA"));
		
		List<Integer> l = map(Arrays.asList("lambdas", "in", "action"), (String s1) -> s1.length());
		System.out.println(l);
		
		Comparator<Apple> c1 = (Apple a1, Apple a2) -> Integer.valueOf(a1.getWeight()).compareTo(a2.getWeight()); 
		
		List<String> list = new ArrayList<>();
		Predicate<String> p = s2->list.add(s);
		Consumer<String> c = s2->list.add(s);
	}
	
	public static <T,R> List<R> map(List<T> list, Function<T,R> f) {
		
		List<R> result = new ArrayList<>();
		for (T s:list) {
			result.add(f.apply(s));
		}
		
		return result;
	}
}
