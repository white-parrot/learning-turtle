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
public class POC005 {

	/*
	 * Given a list of integers, find the total number of elements present in the list using Stream functions
	 */
	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(23, 56, 12, 78, 34, 78, 34, 12, 56, 89, 45, 23, 34, 78);

		System.out.println(intList.stream().count());
	}
}
