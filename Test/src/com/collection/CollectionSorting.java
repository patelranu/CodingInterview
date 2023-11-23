package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSorting {
	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<>();
		obj.add(3);
		obj.add(1);
		obj.add(4);
		obj.add(2);
		obj.add(0);
		Collections.sort(obj, new Comparator<Integer>() {

			public int compare(Integer obj1, Integer obj2) {

				if (obj1 < obj2)
					return 1;
				else if (obj1 > obj2)
					return -1;
				else
					return 0;
			}

		});
		for (Integer i : obj) {
			System.out.println(i);
		}

	}

}
