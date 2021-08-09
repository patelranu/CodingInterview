package com.designprogram;

public class First {
	public static void main(String[] args) {
		int n=5;
		int num=1;
		//first
		/*for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++)
				System.out.print("* ");
		System.out.println("");	
		}*/
		
		//third 
		for(int i=0;i<n;i++){
		  for(int j=1;j<=n-i;j++)
			System.out.print("* ");
	  System.out.println("");	
	 }
		
		
		
		//second
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(i==0)
					System.out.print(num +" ");
				else{
					num=num+2;
				System.out.print(num + " ");
				}
			}
			System.out.println("");
		}
	
	}

}
