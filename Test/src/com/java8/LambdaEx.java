package com.java8;
interface X{
	void show();
}

public class LambdaEx {
	public static void main(String[] args) {
		X obj;
		/*obj=new X(){
			public void show(){
				System.out.println("implement");
			}
		};
		obj.show();*/
		obj=()->{};
		
		obj.show();
	 }

}
