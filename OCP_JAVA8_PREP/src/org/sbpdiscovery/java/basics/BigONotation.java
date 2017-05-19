package org.sbpdiscovery.java.basics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Notations:
 * O(1)
 * O(N)
 * O(N^2)
 * O(log N)
 * O(N log N)
 */
public class BigONotation {

	// **************************************** CLASS VARIABLES **************************************
	
	private static long startTime;
	private static long endTime;
	
	// **************************************** INSTANCE VARIABLES ***********************************
	
	private int[] theArray;
	private int arraySize;
	private int itemsInArray = 0;

	// **************************************** CONSTRUCTOR ******************************************
	
	private BigONotation(int arraySize) {
		this.arraySize = arraySize;
		theArray = new int[arraySize];
	}
	
	// **************************************** O(1) *************************************************
	
	/**
	 *  O(1)
	 *  
	 *  Same time to execute, no matter the size of the array.
	 */
	@SuppressWarnings("unused")
	private void addItemToArray(int newItem) {
		theArray[itemsInArray++] = newItem;
		generateRandomArray();
	}
	
	// **************************************** O(N) *************************************************
	
	/**
	 *  O(N)
	 *  
	 *  Time nexecessary will scale linearly with the size of the array.
	 */
	@SuppressWarnings("unused")
	private void linearSearchForValue(int value) {
		
		boolean valueInArray = false;
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Linear Search Took: " + (endTime - startTime));
		
		System.out.println("Value found: " + valueInArray);
	}
	
	// **************************************** O(N^2) ***********************************************

	/**
	 *  O(N^2)
	 *  
	 *  Time nexecessary will scale exponantially at N^2 with the size of the array. These algorithms
	 *  tend to get slow really fast with increasing array sizes.
	 */
	@SuppressWarnings("unused")
	private void bubbleSort() {
		
		for(int i = arraySize - 1; i > 1  - 1; i--) {
			for(int j = 0; j < i; j++) {
				if(theArray[j] > theArray[j+1]) {
					swapValues(j, j+1);
				}
			}
		}
	}
	
	// **************************************** O(log N) *********************************************
	
	/**
	 *  O(log N)
	 *  
	 *  Time nexecessary will only increase logarithmically with the size of the array. These
	 *  algorithms usually perform very well.
	 */
	@SuppressWarnings("unused")
	private void binarySearchForValue(int value) {
		
		startTime = System.currentTimeMillis();
		
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		int timesThrough = 0;
		
		while(lowIndex <= highIndex) {
			
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(theArray[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			}
			else if(theArray[middleIndex] > value) {
				highIndex = middleIndex - 1;
			}
			else {
				System.out.println("Found Match in Index " + middleIndex);
				lowIndex = highIndex + 1;
			}
			
			timesThrough++;
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("BinarySearch Took: " + (endTime - startTime));
		System.out.println("Times Through: " + timesThrough);
	}
	
	// **************************************** O(N log N) *******************************************
	
	/**
	 *  O(n log N)
	 *  
	 *  Time nexecessary will only increase (log N)! or N log N with the size of the array. These
	 *  algorithms usually perform very well.
	 */
	private void quickSort(int left, int right) {
		
		if((right - left) <= 0) {
			return;
		}
		else {
			
			int pivot = theArray[right];
			
			int pivotLocation = partitionArray(left, right, pivot);
			
			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
		}
	}
	
	
	// **************************************** GENERATE RANDOM ARRAY ********************************
	
	private void generateRandomArray() {
		for(int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 1000) + 10;
			itemsInArray = arraySize - 1;
		}
	}
	
	// **************************************** SWAP VALUES ******************************************
	
	private void swapValues(int first, int second) {
		int temp = theArray[first];
		theArray[first] = theArray[second];
		theArray[second] = temp;
	}
	
	// **************************************** PARTITION ARRAY **************************************

	public int partitionArray(int left, int right, int pivot) {

		int leftPointer = left - 1;

		int rightPointer = right;

		while (true) {

			while (theArray[++leftPointer] < pivot)
				;

			while (rightPointer > 0 && theArray[--rightPointer] > pivot)
				;

			if (leftPointer >= rightPointer) {
				break;
			}
			else {
				swapValues(leftPointer, rightPointer);
			}
		}
		
		swapValues(leftPointer, right);
		return leftPointer;
	}
	
	// **************************************** MAIN *************************************************
	
	public static void main(String[] args) {
		
		//BigONotation testAlgo1 = new BigONotation(1000000);
		BigONotation testAlgo2 = new BigONotation(1000000);
		
		//startTime = System.currentTimeMillis();
		//testAlgo1.bubbleSort();
		//endTime = System.currentTimeMillis();
		//System.out.println("QuickSort Took: " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		testAlgo2.quickSort(0, testAlgo2.itemsInArray);
		endTime = System.currentTimeMillis();
		System.out.println("QuickSort Took: " + (endTime - startTime));
	}

}	// ***********************************************************************************************
