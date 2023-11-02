package com.basic.program;

import java.util.HashSet;
import java.util.Set;

class PairSumCount {

	public void pair(int[] a, int sum) {
		Set<String> list = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					list.add(a[i] + " " + a[j]);
				}
			}
		}
		list.stream().forEach(System.out::println);
	}

}

public class PairSum {
	public static void main(String[] args) {
		int a[] = { 4, 6, 5, -10, 8,2, 5, 20, 5 };
		int sum = 10;
		PairSumCount obj = new PairSumCount();
		obj.pair(a, sum);

	}

}
