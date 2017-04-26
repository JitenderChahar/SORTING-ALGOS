package org.java.jsc.algos;

import java.util.List;

public class QuickSort {
	private List<Integer> list;

	public QuickSort(List<Integer> list) {
		this.list = list;
	}

	public List<Integer> sort() {
		quickSort(0, list.size() - 1);
		return list;
	}

	void quickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			int pivot = list.get(right);
			int partitionPoint = partition(left, right, pivot);
			quickSort(left, partitionPoint - 1);
			quickSort(partitionPoint + 1, right);
		}
	}

	int partition(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {
			while (list.get(++leftPointer) < pivot) {
				// do nothing
			}

			while (rightPointer > 0 && list.get(--rightPointer) > pivot) {
				// do nothing
			}

			if (leftPointer >= rightPointer) {
				break;
			} else {
				System.out.printf(" item swapped :%d,%d\n",
						list.get(leftPointer), list.get(rightPointer));
				swap(leftPointer, rightPointer);
			}
		}

		System.out.printf(" pivot swapped :%d,%d\n", list.get(leftPointer),
				list.get(right));
		swap(leftPointer, right);
		System.out.printf("Updated Array: ");
		System.out.println(list);
		return leftPointer;
	}

	void swap(int num1, int num2) {
		int temp = list.get(num1);
		list.set(num1, list.get(num2));
		list.set(num2, temp);
	}
}
