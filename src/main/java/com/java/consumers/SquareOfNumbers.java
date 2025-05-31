package com.java.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SquareOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 67, 81, 12, 1);
		Consumer<Integer> squareOfNumbers = number -> System.out.println(number * number);
		numbers.forEach(squareOfNumbers);

	}

}
