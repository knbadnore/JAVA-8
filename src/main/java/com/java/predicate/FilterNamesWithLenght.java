package com.java.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNamesWithLenght {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AVE", "DON", "ALICE", "BOB", "DIAA");
		Predicate<String> shortName = name -> name.length() < 4;
		List<String> finalList = names
				.stream()
				        .filter(shortName)
				                          .collect(Collectors.toList());
		System.out.println("FINAL LIST : "+finalList);
	}

}
