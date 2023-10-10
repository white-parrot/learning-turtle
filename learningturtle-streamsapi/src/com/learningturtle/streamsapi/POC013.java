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
import java.util.stream.Collectors;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 12-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC013 {

	/* Java 8 program to perform cube on list elements and filter numbers greater than 50 */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56, 5, 12, 78, 34, 7, 78, 6, 34, 3, 12, 56, 89, 4, 45, 23, 1, 34, 78);
		
		List<Integer> opList = intList.stream().map(n -> n*n*n).filter(n -> n > 50).collect(Collectors.toList());
		
		opList.forEach(System.out::println);
		
	}
}
