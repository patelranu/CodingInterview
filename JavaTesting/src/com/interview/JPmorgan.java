package com.interview;
import java.util.HashMap;
import java.util.Map;


 class JpChase {
	 static int x;
	
	 static  void x(){
		 System.out.println("parent" +x);;
	 }
 }
 class Morgon extends JpChase{
	  static int x=9;
	 long y;
	 static  void x(){
		 System.out.println("child");;
	 }
 }

public class JPmorgan {
	 
	public static void main(String[] args) {
		
		Morgon obj=new Morgon();
		System.out.println(obj.x);
		
		System.out.println(obj.y +"....................");
		JpChase.x();
		
		
		/*String a="abc";
		String b=new String("abc");
		Map<String, String> map=new HashMap<>();
		map.put(a, "10");
		map.put(b, "20");
		map.put(new String("abc"), "30");
		System.out.println(map.get("abc"));*/
		
		
	}

}
