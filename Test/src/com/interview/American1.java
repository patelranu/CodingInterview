package com.interview;

public class American1 {
   public static void main(String[] args) {
	int n=10;
	  int x =closed(n);
	  int first=1;
	  int second=0;
	  second=x-first;
	  System.out.println(Integer.parseInt((first+""+second)));
	   
}

private static int closed(int n) {
	      String s=n+"";
	      int sum=0;
	          char c[]=s.toCharArray();
	          for(char x:c)
	        	sum=sum+Integer.parseInt(x+"");
	          
	        sum=sum*2;
	          
	return sum;
}
}
