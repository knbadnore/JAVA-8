package com.java.consumers;

import java.util.function.Consumer;

public class UpperCase {
	public static void main(String[] args) {
		Consumer<String> printUpperCase = str -> System.out.print(str.toUpperCase());
		printUpperCase.accept("test consumer");

	}
}
