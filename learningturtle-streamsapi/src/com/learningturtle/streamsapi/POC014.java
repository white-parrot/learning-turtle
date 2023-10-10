/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright � 2023 Runtime Turtle. All rights reserved.
 */
package com.learningturtle.streamsapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 12-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC014 {

	/* Write a Java 8 program to sort an array and then convert the sorted array into Stream */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56, 5, 12, 78, 34, 7, 78, 6, 34, 3, 12, 56, 89, 4, 45, 23, 1, 34, 78);
		
		Collections.sort(intList);
		
		/* Using Arrays Parallel Sort*/
		// Arrays.parallelSort(new int[]{23, 56, 5, 12, 78, 34, 7, 78, 6, 34, 3, 12, 56, 89, 4, 45, 23, 1, 34, 78});
		
		intList.stream().forEach(System.out::println);
		
	}
}
