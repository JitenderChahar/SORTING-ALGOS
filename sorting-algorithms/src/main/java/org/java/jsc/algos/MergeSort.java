package org.java.jsc.algos;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	private List<Integer> list;
	private List<Integer> tempList;

	public MergeSort(List<Integer> list) {
		this.list = list;
		tempList = new ArrayList<>(list);
	}

	public List<Integer> sort() {
		sort(0, list.size() - 1);
		return list;
	}

	public void sort(int low, int high) {
		int mid;
		System.out.println("Low and High : " + low + " " + high);
		if (low < high) {
			mid = (low + high) / 2;
			System.out.println("	=> mid : " + mid);
			sort(low, mid);
			sort(mid + 1, high);
			merging(low, mid, high);
		}
	}

	public void merging(int low, int mid, int high) {
		int l1;
		int l2;
		int i;

		for (l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
			if (list.get(l1) <= list.get(l2)) {
				tempList.set(i, list.get(l1++));
			} else {
				tempList.set(i, list.get(l2++));
			}
		}

		while (l1 <= mid) {
			tempList.set(i++, list.get(l1++));
		}

		while (l2 <= high) {
			tempList.set(i++, list.get(l2++));
		}

		for (i = low; i <= high; i++) {
			list.set(i, tempList.get(i));
		}

		// show merging
		display(low, high);

	}

	private void display(int low, int high) {
		System.out.println();
		System.out.print("Merging :  [");
		for (int i = low; i <= high; i++) {
			System.out.print(" " + list.get(i));
		}
		System.out.print(" ]");
		System.out.println();

	}
}
