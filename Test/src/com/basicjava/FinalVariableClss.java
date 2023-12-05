package com.basicjava;
//final varible can we assign by initializer block, and const
//static,ini,const
class ParentVars{
	final int x;
	{
		x=6;
		System.out.println("parent1");
	}
	ParentVars(){
//		x=7;
		System.out.println("parent2");
	}
	static{
		System.out.println("static");
	}
	
	public  void x(){
		System.out.println("parent...." +x);
	}
};
class VarsChild extends ParentVars{
	
	VarsChild(){
	
		System.out.println("child");
	}
	public void x(){
		System.out.println("child...."+x);
	}
}

public class FinalVariableClss {
	public static void main(String[] args) {
		ParentVars o=new VarsChild();
		o.x();
	}

}
