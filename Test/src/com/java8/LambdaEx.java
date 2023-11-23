package com.java8;
interface X{
	void hans();
	void display(String a);
}

public class LambdaEx {
	public static void main(String[] args) {
		X i = new X() {
            public void hans() {
                System.out.println("Hans");
            }
            public void display(String a) {
                System.out.println(a);
            }
        };

        i.hans();
        i.display("Hello");
    }
	 }


