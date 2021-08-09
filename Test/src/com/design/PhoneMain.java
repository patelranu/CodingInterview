package com.design;

public class PhoneMain {
  public static void main(String[] args) {
	 Phone p=new PhoneBuilder().setName("Iphone").setRam("8G").getPhone();
      System.out.println(p.toString());
      
  }
}
