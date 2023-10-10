/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright � 2023 Runtime Turtle. All rights reserved.
 */
package com.learningturtle.streamsapi;

import java.util.Arrays;
import java.util.List;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 12-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC015 {

	/* How to use map to convert object into Uppercase in Java 8 */
	
	public static void main(String[] args) {
		
		List<String> text = Arrays.asList("How", "to", "use", "map", "to", "convert", "object", "into", "Uppercase", "in", "Java", "8");
		
		text.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
	}
}
