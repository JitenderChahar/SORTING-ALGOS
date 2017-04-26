package org.java.jsc.algos;

import java.util.List;

public class InsertionSort {
	public static void insertionSort(List<Integer> list) {

		int valueToInsert;
		int holePosition;
		int i;

		// loop through all numbers
		for (i = 1; i < list.size(); i++) {

			// select a value to be inserted.
			valueToInsert = list.get(i);

			// select the hole position where number is to be inserted
			holePosition = i;

			// check if previous no. is larger than value to be inserted
			while (holePosition > 0
					&& list.get(holePosition - 1) > valueToInsert) {
				list.set(holePosition, list.get(holePosition - 1));
				holePosition--;
				System.out.printf(" item moved : %d\n", list.get(holePosition));
			}

			if (holePosition != i) {
				System.out.printf(" item inserted : %d, at position : %d\n",
						valueToInsert, holePosition);
				// insert the number at hole position
				list.set(holePosition, valueToInsert);
			}

			System.out.printf("Iteration %d#:", i);
		}
	}
}
