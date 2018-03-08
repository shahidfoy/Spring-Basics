package com.shaidfoy.spring.basics.springinsimplesteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		// Sorting an array
		// Sort Algorithm
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array	
		int lowIndex = 0;
		int highIndex = numbers.length - 1;
		
		while(lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(numbers[middleIndex] < numberToSearchFor) {
				lowIndex = middleIndex + 1;
			} else if(numbers[middleIndex] > numberToSearchFor) {
				highIndex = middleIndex - 1;
			} else if(numbers[middleIndex] == numberToSearchFor){
				lowIndex = highIndex + 1;
				return numbers[middleIndex];
			} 
		}
		return 0;
				
	}
	
	
}
