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
public class POC001 {

	/* Given a list of Integers, find out all the even numbers that exists in the list using Stream functions */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78);
		
		List<Integer> evenIntList = intList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
		evenIntList.forEach(System.out::println);
		
	}
}
