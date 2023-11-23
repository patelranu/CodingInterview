package com.basicjava;
class CovA{
	CovA(){
		System.out.println("CovA const");
	}
	
}
class CovB extends CovA{
	CovB(){
		System.out.println("CovB const");
	}
	
}
class Base{
	CovA get(){
		System.out.println("base");
		return new CovA();
	}
}
//compile error
class Derived extends Base{
	CovB get(){
		System.out.println("derived");
		return new CovB();
	}
}

public class CoveriantReturn {
	public static void main(String[] args) {
		Base o=new Base();
		System.out.println(o.get());
		Derived d=new Derived();
		System.out.println(d.get());
	}

}
