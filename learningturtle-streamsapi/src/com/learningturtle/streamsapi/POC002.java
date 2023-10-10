/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright © 2023 Runtime Turtle. All rights reserved.
 */
package com.learningturtle.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 10-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC002 {

	/* Given a list of integers, find out all the numbers starting with 1 using Stream functions */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78);
		
		List<Integer> evenIntList = intList.stream()
				.map(n -> n + "")
				.filter(s -> s.startsWith("1"))
				.map(s -> Integer.parseInt(s))
				.collect(Collectors.toList());
		
		evenIntList.forEach(System.out::println);
		
	}
}
