/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright © 2023 Runtime Turtle. All rights reserved.
 */
package com.learningturtle.streamsapi;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 10-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC008 {

	/* Given a String, find the first non-repeated character in it using Stream functions */

	public static void main(String[] args) {

		String text = "Turtle is Learning Java 11 Streams API Slowly";
		
		/* Ignore Case Result*/
		String key = text.chars() // IntStream : Stream of surrogate codepoint of the Chars
			.mapToObj(n -> Character.toLowerCase((char)n))  // Convert the surrogate codepoint into chars and convert into lower case, It will return Stream of Characters
			.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // It will create a LinkedHashMap with Char as Key and Char Count as Value
			.entrySet()  // Get the Entry Set from the Map
			.stream() // Create a Stream again to get the First Element with Count > 1
			.filter(e -> e.getValue() > 1)  // Filter all the element with Count > 1
			.findFirst()// Get the First Element with Count > 1
			.get() // Get the Element (Entry)
			.getKey() + ""; // Convert into String
			
		System.out.println(key);
		
		/* Case Sensitive Result*/
		key = text.chars() // IntStream : Stream of surrogate codepoint of the Chars
				.mapToObj(n -> (char)n)  // Convert the surrogate codepoint into chars and convert into lower case, It will return Stream of Characters
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // It will create a LinkedHashMap with Char as Key and Char Count as Value
				.entrySet()  // Get the Entry Set from the Map
				.stream() // Create a Stream again to get the First Element with Count > 1
				.filter(e -> e.getValue() > 1)  // Filter all the element with Count > 1
				.findFirst()// Get the First Element with Count > 1
				.get() // Get the Element (Entry)
				.getKey() + ""; // Convert into String
				
			System.out.println(key);
				
	}
}
