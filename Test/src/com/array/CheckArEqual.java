package com.array;

public class CheckArEqual {
	public static void main(String[] args) {
		int[] a = {21, 57, 11, 37, 24};
        int[] b = {21, 47, 11, 37, 24,76};
        boolean result=true;
        if(a.length!=b.length){
        	result=false;
        }else{
        	for(int i=0;i<a.length;i++){
        		if(a[i]!=b[i]){
        			result=false;
             	   break;
        		}	
        	}
        }
        if(result)
        System.out.println("array equal");
        else
        	System.out.println("not equal");
	}

}
