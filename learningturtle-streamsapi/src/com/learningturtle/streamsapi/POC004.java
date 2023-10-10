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
import java.util.Optional;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 10-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC004 {

	/* Given the list of integers, find the first/Any element of the list using Stream functions */
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(23, 56 ,12, 78, 34 ,78 ,34 ,12, 56, 89 ,45, 23 ,34, 78);
		
		intList.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("-----------------------");
		
		/* Using Optional */
		Optional<Integer> n = intList.stream().findFirst();
		System.out.println(n.get());

		System.out.println("-----------------------");
		
		/* FInd Any*/
		intList.stream().findAny().ifPresent(System.out::println);
		
	}

}
