package com.coding.java8;

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
