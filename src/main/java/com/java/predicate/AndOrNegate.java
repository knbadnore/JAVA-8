package com.java.predicate;

import java.util.*;
import java.util.function.Predicate;

public class AndOrNegate {

	public static void main(String[] args) {
		
		Predicate<String> startsWithJ = p -> p.startsWith("J");
		Predicate<String> endsWithN = p -> p.endsWith("N");
		Predicate<String> combineAnd = p -> (p.startsWith("K")||p.contains("John"))&&p.endsWith("as");
		System.out.println(combineAnd.test("Joh1as"));


	}

}
