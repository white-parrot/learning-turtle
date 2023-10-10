/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright � 2023 Runtime Turtle. All rights reserved.
 */
package com.learningturtle.streamsapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 12-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC011 {

	/* Given an integer array nums, return true if any value appears at least twice or more in the array, else false */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78);
		
		/* Using Stream's Distinct */
		List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
		
		if(intList.size() == distinctIntList.size()) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		/* using Array and Set */
		int[] intArr = {23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78};
		
		intList = Arrays.stream(intArr).boxed().collect(Collectors.toList()); // Boxed converts IntStream to Stream<Integer>
		Set<Integer> intSet = new HashSet<>(intList);
		if(intList.size() == intSet.size()) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
	}
}
