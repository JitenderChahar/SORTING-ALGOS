package org.java.jsc.algos;

import java.util.Map;

public class DisplayUtils {
	public static void print(int[] numbers) {
		System.out.print("[");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		System.out.print(" ]");
		System.out.println("");
	}
	
	public static void dumpAllStackTraces() {
		for (Map.Entry<Thread, StackTraceElement[]> entry : Thread
				.getAllStackTraces().entrySet()) {
			System.out.println(entry.getKey().getName() + ":");
			for (StackTraceElement element : entry.getValue())
				System.out.println("\t" + element);
		}
	}
}
