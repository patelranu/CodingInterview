package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayTest {
	public static void main(String[] args) {
		// condition -a -startwith

		String a[] = { "aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra",
				"allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle" };
		List<String> list = Arrays.asList(a);
		List<String> listObject = list.stream().filter(i -> i.startsWith("aa")).collect(Collectors.toList());
		System.out.println(listObject);
		for (String s : listObject) {
			char c[] = s.toCharArray();
			Set<Character> charList = new HashSet<>();
			for (int i = 0; i < c.length; i++) {
				charList.add(c[i]);
			}
			System.out.println(s + " .." + charList.size());

		}

	}

}
