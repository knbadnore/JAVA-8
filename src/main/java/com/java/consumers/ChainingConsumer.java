package com.java.consumers;

import java.util.function.Consumer;

public class ChainingConsumer {

	public static void main(String[] args) {

		Consumer<String> print = str -> System.out.println(str);
		Consumer<String> greetingsOfDay = str -> System.out.println("Good Morning");

		Consumer<String> concat = greetingsOfDay.andThen(print);

		concat.accept("JOHN ....!!!!!!!");

	}

}
