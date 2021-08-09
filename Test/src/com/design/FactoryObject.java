package com.design;

public class FactoryObject {
	public OS getInst(String str){
		if(str=="welcome"){
			return new Android();
		}
		return null;
		
	}

}
