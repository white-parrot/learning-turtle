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
import java.util.stream.Stream;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 12-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC012 {

	/* Write a Java 8 program to concatenate two Streams */
	
	public static void main(String[] args) {
		
		List<Integer> intList1 = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78);
		
		List<Integer> intList2 = Arrays.asList(55, 57, 67, 26, 45, 72, 66, 19, 27, 38, 28, 97, 68, 37);
		
		Stream<Integer> intStream = Stream.concat(intList1.stream(), intList2.stream());
		
		intStream.forEach(System.out::println);
		
	}
}
