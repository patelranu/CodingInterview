package com.interview;

class Example {

	public String reverseString(String s) {
		String output = "";
		for (int i = s.length() - 1; i >= 0; i--) 
			output = output + s.charAt(i);
		return output;
	}

	public String removeVowel(String s) {

		String output = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e') 
				output = output + s.charAt(i);
		}
		return output;

	}

	public int countVowel(String s) {
		int count = 0;
         for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u')
				count++;
	}
		return count;
	}

	public boolean powerOfTwo(int value) {
		int currentValue=value;
		
		while(currentValue>=1){
			currentValue=currentValue/2;
			if(currentValue%2!=0 && currentValue!=1){
				return false;
			}
				
			
		}
		
		return true;
	}

	public char firstNonRepeatChar(String s) {
		String str = "";
		char value = 0;
		for (int i = 0; i < s.length(); i++) {
			if (str.contains(s.charAt(i) + ""))
				continue;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					str = str + s.charAt(i);
					break;
				}
				if (j == s.length() - 1) {
					return s.charAt(i);
				}

			}
		
		}
		return value ;
		
		
	}

	public void missingNumber(int[] a, int i) {
			int x=	a.length;
	}

	public void printOddPlace(int[] a) {
		for(int i=0;i<a.length;i=i+2){
			System.out.println(a[i]);
		}
		
	}

}

public class Practice {
	public static void main(String[] args) {
		Example obj = new Example();
		int powerNumber=32;
		String s = "ranu patel";
		int a[]={1,3,5,8,6};
//		System.out.println("orignal String : " + s);
//		System.out.println("Reverse String :" + obj.reverseString(s));
//		System.out.println("remove vowel String : " + obj.removeVowel(s));
//		System.out.println("count vowel String : " + obj.countVowel(s));
        //boolean result=obj.powerOfTwo(powerNumber);
        //System.out.println(result);
       //char value=obj.firstNonRepeatChar("ranu");
      // System.out.println(value);
      // obj.missingNumber(a,4);
       obj.printOddPlace(a);
	}

	

}
