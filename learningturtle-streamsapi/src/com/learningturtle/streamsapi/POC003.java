/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright © 2023 Runtime Turtle. All rights reserved.
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
 * @since 10-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC003 {

	/* How to find duplicate elements in a given integers list in java using Stream functions */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78);
		Set<Integer> distinctIntSet1 = new HashSet<>();
		
		/* Get All the Distinct No. after removing their duplicates */
		List<Integer> distinctIntList = intList.stream()
				.filter(n -> distinctIntSet1.add(n))
				.collect(Collectors.toList());
		
		distinctIntList.forEach(System.out::println);

		System.out.println("-----------------------------");
		
		/* Get All the Distinct No. after removing their duplicates */
		 
		/* Local variable distinctIntSet1 defined in an enclosing scope 
		 * must be final or effectively final.
		 * So we can't use distinctIntSet1 = new HashSet<>();
		 */
		Set<Integer> distinctIntSet2 = new HashSet<>();
		List<Integer> duplicateIntList = intList.stream()
				.filter(n -> !distinctIntSet2.add(n))
				.collect(Collectors.toList());
		
		/* Duplicate Numbers with All the Duplicate Occurrences */
		duplicateIntList.forEach(System.out::println);

		System.out.println("-----------------------------");
		
		/* Duplicate Numbers with Only Single Occurrence */
		Set<Integer> distinctIntSet3 = new HashSet<>();
		Set<Integer> duplicateIntSet = intList.stream()
				.filter(n -> !distinctIntSet3.add(n))
				.collect(Collectors.toSet());
		
		duplicateIntSet.forEach(System.out::println);
	}
}
