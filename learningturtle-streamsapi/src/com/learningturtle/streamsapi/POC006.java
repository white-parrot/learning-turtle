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

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 10-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC006 {

	/* Given a list of integers, find the maximum value element present in it using Stream functions */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 90, 56, 89 ,45, 23 ,34, 78);
		
		/* Max */
		intList.stream().max(Integer::compare).ifPresent(System.out::println);
		
		/* Min */
		intList.stream().min(Integer::compare).ifPresent(System.out::println);
	}
}
