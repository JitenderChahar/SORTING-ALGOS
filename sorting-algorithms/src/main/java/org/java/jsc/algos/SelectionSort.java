package org.java.jsc.algos;

import java.util.List;

public class SelectionSort {
	public static void selectionSort(List<Integer> list) {

		int indexMin;
		int i;
		int j;

		// loop through all numbers
		for (i = 0; i < list.size() - 1; i++) {

			// set current element as minimum
			indexMin = i;

			// check the element to be minimum
			for (j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(indexMin)) {
					indexMin = j;
				}
			}

			if (indexMin != i) {
				System.out.printf("Items swapped: [ %d, %d ]\n", list.get(i),
						list.get(indexMin));

				// swap the numbers
				int temp = list.get(indexMin);
				list.set(indexMin, list.get(i));
				list.set(i, temp);
			}

			System.out.printf("Iteration %d#:", (i + 1));
		}
	}
}
