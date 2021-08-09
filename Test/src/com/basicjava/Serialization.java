package com.basicjava;
//chang state from Java to file supported over the network.
import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialV implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient String pass="password";
	int b=20;
	private void writeObject(ObjectOutputStream os) throws IOException{
		os.defaultWriteObject();
		String pass1="123"+pass;
		os.writeObject(pass1);
	}
	
	
	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException{
		is.defaultReadObject();
		String pass1= (String) is.readObject();
		pass= pass1.substring(3);
	}
}
public class Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerialV obj=new SerialV();
	FileOutputStream fos=new FileOutputStream("abc.str");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	 oos.writeObject(obj);
	  
	  FileInputStream fis=new FileInputStream("abc.str");
	  ObjectInputStream ois=new ObjectInputStream(fis);
	  SerialV obj1=(SerialV) ois.readObject();
	  System.out.println(obj1.pass +" *****");
	  System.out.println(obj1.b +" *****");
	  
	  
		
 }

}
