package com.interview;

public class Nagra {
	public static void main(String[] args) {
		//a,e,i,o,u-@
		
		String s="ranu patel";
		String value="";
		 for(int i=0;i<s.length();i++){
			 if(i%2==0)
				 value=value+s.charAt(i);
			 else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				 value=value+"@";
			 else
				 value=value+s.charAt(i);
		}
		 System.out.println(value);
		
		
	}

}
