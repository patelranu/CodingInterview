package com.java8;

import java.util.Arrays;
import java.util.List;

public class IntegerArr {
   public static void main(String[] args) {
	int a[]={1,2,3,4};
	//int-Integer
	Integer ai[]=Arrays.stream(a).boxed().toArray(Integer[]::new);
	//Int-List
	List<Integer>l= Arrays.asList(ai);
	//List-int Array
	int [] li=l.stream().mapToInt(Integer::intValue).toArray();
}
}
