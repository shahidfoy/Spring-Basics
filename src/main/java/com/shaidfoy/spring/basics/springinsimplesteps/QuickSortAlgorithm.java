package com.shaidfoy.spring.basics.springinsimplesteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	
	private int[] numbersArray;
		
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		int left = 0;
		int right = numbers.length - 1;
		this.numbersArray = numbers;
		
		quickSort(left, right);
		
		return numbersArray;
	}
	
	public void quickSort(int left, int right) {
		if(right - left <= 0) {
			return;
		} else {
			int pivot = numbersArray[right];
			int pivotLocation = partitionArray(left, right, pivot);
			
			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
		}
	}
	
	public int partitionArray(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;
		
		while(true) {
			while(numbersArray[++leftPointer] < pivot);
			while(rightPointer > 0 && numbersArray[--rightPointer] > pivot);
			
			if(leftPointer >= rightPointer) {
				break;
			} else {
				swapValues(leftPointer, rightPointer);
			}
		}
		
		swapValues(leftPointer, right);
		return leftPointer;
	}
	
	public void swapValues(int indexOne, int indexTwo) {
		int temp = numbersArray[indexOne];
		numbersArray[indexOne] = numbersArray[indexTwo];
		numbersArray[indexTwo] = temp;
	}

}
