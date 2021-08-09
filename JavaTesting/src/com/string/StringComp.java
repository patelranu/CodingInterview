package com.string;

public class StringComp {
 @SuppressWarnings("unused")
public static void main(String[] args) {
String x="ranu patel";
String y="ranu patel";
boolean result=true;

  for(int i=0;i<y.length();i++){
	  if(x.charAt(i)!=y.charAt(i)){
			result=false;
			  break;
	  }
  }
  if(result)
	  System.out.println("string equal");
  else
	  System.out.println("not equal");
}
}
