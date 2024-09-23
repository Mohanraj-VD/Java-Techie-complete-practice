package com.practice.java.Stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Arrays;

public class PredicateExample {
	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Define a Predicate to check if a number is even
//	        Predicate<Integer> isEven = num -> num % 2 == 0;  //The Predicate interface represents a single argument function that returns a boolean value. It is commonly used for filtering elements in a collection or making decisions based on conditions.
//
//	        // Define a Consumer to print a number
//	        Consumer<Integer> printNumber = System.out::println; //The Consumer interface represents an operation that accepts a single input and returns no result. It is often used for performing actions on elements of a collection or processing data without returning anything.
			Predicate<Integer> predicateNum = n->n%3==0;
			Supplier<Double> supp = Math::random;
			Consumer<Integer> cons = System.out::println;
			
			List<Integer> evenNumbers = numbers.stream()
					.filter(predicateNum).toList();
			
			evenNumbers.forEach(cons);
	        double random = supp.get();
	        System.out.println(random);
	}
}
