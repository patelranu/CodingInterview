package com.array;

import java.util.ArrayList;

public class Parking {
    public static void main(String[] args) {
    	int count=0;
    	char a[]={'V','V', 'H', 'H', 'V', 'H','H','V',};
    	ArrayList<Integer> list=new ArrayList<>();
    	for(int i=0;i<a.length;i++){
    		if(a[i]=='V')
    			list.add(i);
    	}
    	for(Integer obj:list){
    		if(obj.equals(0)){
    			if(a[1]=='H')
    				count++;
    		}else{
    			if(a[obj.intValue()-1]=='H'&& a[obj.intValue()+1]=='H')
    				count++;
    		}
    	}
    	System.out.println(count);

	}
}
