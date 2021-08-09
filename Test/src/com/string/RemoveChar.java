package com.string;
//A-Z 65-90
//a-z 97-122
//0-9  48-57


public class RemoveChar {
	public static void main(String[] args) {
    char a='Z';
    if(a>123){
    	System.out.println("Hello ranu...");
    }
	//int x=a;
	//System.out.println(x);
	String x="ranu123$%#%$#%";
	removeChar(x.toCharArray());
	}

	private static void removeChar(char x[]) {
		String val="";	
		for(int i=0;i<x.length;i++){
		if(x[i]<65 && x[i]>90 || x[i]<97 && x[i]<122){
			val=val+x[i];
		}
		}
		System.out.println(val);
	}

}
