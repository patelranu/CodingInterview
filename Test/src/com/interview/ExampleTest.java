package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//anagram, miisng word in two String,
class JPMorganTest {

	public List<String> missingChar(String s1, String s2) {
		List<String> list = new ArrayList<>();

		String arr[] = s1.split(" ");
		String arr1[] = s2.split(" ");
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals(arr1[index])) {
				list.add(arr[i]);
			} else {
				index++;
			}
		}
		return list;

	}

	public boolean anagramCheck(String a1, String a2) {

		if (a1.length() != a2.length()) {
			return false;
		} else {
			Map<Character, Integer> mapA1 = mapingElement(a1);
			Map<Character, Integer> mapA2 = mapingElement(a2);
			for (Map.Entry<Character, Integer> entry : mapA1.entrySet()) {
				if (entry.getValue() != mapA2.get(entry.getKey())) {
					return false;
				}
			}
		}
		return true;

	}

	private Map<Character, Integer> mapingElement(String s) {
		char[] c = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char a : c) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else
				map.put(a, 0);
		}
		return map;
	}

	public char[] factorial(int value) {
		
		return null;
	}

}

public class ExampleTest {
	public static void main(String[] args) {

		String s1 = "ranu is working in IT a company, she is in a mumbai";
		String s2 = "is working a company, she is mumbai";
		String a1 = "ranua";
		String a2 = "anrua";
		int value=5;
		JPMorganTest obj = new JPMorganTest();
		//System.out.println(obj.missingChar(s1, s2));
		System.out.println(obj.anagramCheck(a1, a2));
		System.out.println(obj.factorial(value));

	}

}
