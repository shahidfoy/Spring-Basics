package com.shaidfoy.spring.basics.springinsimplesteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		
		for(int i = numbers.length - 1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
			
		return numbers;
	}

}
