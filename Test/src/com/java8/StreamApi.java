package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// map operation is used where we perform some operation in values 
//filter is use where we not perform and modification....

//if we applying foreach after filter without collect then it directly display value...

public class StreamApi {
public static void main(String[] args) {
	    //1 create List
	List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
	   //2 Map number
	List<Integer>lobj=list.stream().map(i->i+5).collect(Collectors.toList());
      for(Integer a:lobj){
    	  System.out.println(a);
      }
      
   List<String> obj=new ArrayList<>();
   obj.add("ranu");
   obj.add("rash");
   obj.add("ranu");
   //3 filter
   Set<String>ob= obj.stream().filter(val->val.equals("ranu")).collect(Collectors.toSet());
   for(String a:ob){
 	  System.out.println(a);
   } 
   
   // 4 .foreach
   list.stream().filter(val->val%2==0).forEach(System.out::println);
   
   //convert list to set
   
   Set s= obj.stream().collect(Collectors.toSet());
   System.out.println(s);
}
}
