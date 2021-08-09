package com.interview;

public class A1 {
	public static void main(String[] args) {
		int i=2;
		for(int n=2;n<20;n++){
			for(i=2;i<n;i++){
				if(n%i==0){
					break;
				}
			}
			if(i==n)
				System.out.println(n);
		}
		/*String s = "RAnu patel";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o') {
				System.out.print(s.charAt(i));
                               
			}
		}*/
		

		/*
		 * String x="ranu patel ruby patel rashmi"; String a[]=x.split(" ");
		 * for(int i=0;i<a.length;i++){ char c[]=a[i].toCharArray(); for(int
		 * j=c.length-1;j>=0;j--) System.out.print(c[j]); System.out.print(" ");
		 * }
		 */
		 /*char c[]=a.toCharArray();
		 for(int i=c.length-1;i>=0;i--)
		 System.out.print(c[i]);*/

		/*
		 * int a=10; int b=20; a=a+b; //a=30 b=a-b; //10 a=a-b;
		 * System.out.println(a); System.out.println(b);
		 */
	}

}
