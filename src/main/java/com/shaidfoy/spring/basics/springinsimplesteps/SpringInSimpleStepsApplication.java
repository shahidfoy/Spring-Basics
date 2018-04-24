package com.shaidfoy.spring.basics.springinsimplesteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInSimpleStepsApplication {

	public static void main(String[] args) {		
		// Application Context maintains all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringInSimpleStepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6, 3, 9, 7, 8 }, 6);
		System.out.println(result);
	}
}
