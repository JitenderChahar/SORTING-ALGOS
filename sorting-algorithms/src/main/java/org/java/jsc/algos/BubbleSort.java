package org.java.jsc.algos;

import java.util.List;

public class BubbleSort {
	/**
	 * Bubble sort
	 * 
	 * @param list
	 */
	public static void bubbleSort(List<Integer> list) {
		int temp;
		int i;
		int j;

		boolean swapped;

		// loop through all numbers
		for (i = 0; i < list.size() - 1; i++) {
			swapped = false;

			// loop through numbers falling ahead
			for (j = 0; j < list.size() - 1 - i; j++) {
				System.out.println("     Items compared: [ " + list.get(j)
						+ ", " + list.get(j + 1) + " ]");

				// check if next number is lesser than current no
				// swap the numbers.
				// (Bubble up the highest number)

				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

					swapped = true;
					System.out.println(" => swapped [" + list.get(j) + ", "
							+ list.get(j + 1));
				} else {
					System.out.println(" => not swapped");
				}

			}

			// if no number was swapped that means
			// array is sorted now, break the loop.
			if (!swapped) {
				break;
			}
		}

	}
}
