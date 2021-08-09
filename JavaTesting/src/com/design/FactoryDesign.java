package com.design;

public class FactoryDesign {
	public static void main(String[] args) {
		FactoryObject o=new FactoryObject();
		OS os=o.getInst("welcome");
		os.getos();
	}

}
