package org.java.jsc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.java.jsc.algos.BubbleSort;
import org.java.jsc.algos.InsertionSort;
import org.java.jsc.algos.MergeSort;
import org.java.jsc.algos.QuickSort;
import org.java.jsc.algos.SelectionSort;

public class TestClass {
	public static void main(String[] args) {
		/********************************************************************************/
		/*							BUBBLE SORT											*/
		/********************************************************************************/
		List<Integer> unsortedListForBubble = new ArrayList<>(Arrays.asList(1,
				8, 4, 6, 0, 3, 5, 2, 7, 9));
		System.out.println("Unsorted list before bubble sort  : "
				+ unsortedListForBubble);
		BubbleSort.bubbleSort(unsortedListForBubble);
		System.out.println("Sorted list after bubble sort : "
				+ unsortedListForBubble);

		/********************************************************************************/
		/*							INSERTION SORT											*/
		/********************************************************************************/
		List<Integer> unsortedListForInsetion = new ArrayList<>(Arrays.asList(
				4, 6, 3, 2, 1, 9, 7));
		System.out.println("Unsorted list before insertion sort  : "
				+ unsortedListForInsetion);
		InsertionSort.insertionSort(unsortedListForInsetion);
		System.out.println("Sorted list after insertion sort : "
				+ unsortedListForInsetion);

		/********************************************************************************/
		/*							SELECTION SORT											*/
		/********************************************************************************/
		List<Integer> unsortedListForSelection = new ArrayList<>(Arrays.asList(
				4, 6, 33, 5, 2, 2, 1, 9, 7));
		System.out.println("Unsorted list before selection sort  : "
				+ unsortedListForSelection);
		SelectionSort.selectionSort(unsortedListForSelection);
		System.out.println("Sorted list after selection sort : "
				+ unsortedListForSelection);

		/********************************************************************************/
		/*							MERGE SORT											*/
		/********************************************************************************/
		List<Integer> unsortedListForMerge = new ArrayList<>(Arrays.asList(10,
				42, 44, 0, -2));
		System.out.println("Unsorted list before merge sort  : "
				+ unsortedListForMerge);
		MergeSort mergerSort = new MergeSort(unsortedListForMerge);
		unsortedListForMerge = mergerSort.sort();
		System.out.println("Sorted list after merge sort : "
				+ unsortedListForMerge);

		/********************************************************************************/
		/*							QUICK SORT											*/
		/********************************************************************************/
		List<Integer> unsortedListForQuick = new ArrayList<>(Arrays.asList(4,
				6, 3, 2, 1, 9, 7));
		System.out.println("Unsorted list before quick sort  : "
				+ unsortedListForQuick);
		QuickSort quickSort = new QuickSort(unsortedListForQuick);
		unsortedListForQuick = quickSort.sort();
		System.out.println("Sorted list after quick sort : "
				+ unsortedListForQuick);

	}

}
