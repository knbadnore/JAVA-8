package com.java.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.consumers.pojo.Person;

public class CombinedPredicates {

	public static void main(String[] args) {
		List<Person> person= Arrays.asList(new Person("JOHN",21)
				,new Person("ALIC", 12),
				 new Person("DAISY", 22));
		Predicate<Person>isAdult1=per->per.age>=18;
		
		List<Person> adults= person.stream()
				.filter(isAdult1)
				    .collect(Collectors.toList());
		
		adults.forEach(p->System.out.println(p.name));
		
		

	}

}
