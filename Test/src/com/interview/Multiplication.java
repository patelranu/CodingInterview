package com.interview;





public class Multiplication {
	public static void main(String[] args) {
	int result=	multi(3,-2);
	System.out.println(result);
		
	}
		/*int i=5,j=3,sum=0;
		while(j>0){
			sum=sum+i;
			j--;
		}
		System.out.println(sum);
	}*/

	private static int multi(int x, int y) {
		 if(y==0)return 0;
		 else if(y>0) return (x+multi(x, y-1));
		 else if(y<0){
			 return -multi(x,-y);
		 }
		return 0;
		 
	}

}
