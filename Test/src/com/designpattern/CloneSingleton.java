package com.designpattern;
//In Singleton, we can not clone the object, if manually we want then implements cloneable class
//but it throws CloneNotSupportedException exception 
class SingletonClone implements Cloneable{
	private static SingletonClone obj;
	
	private SingletonClone(){
		System.out.println("object created...");
	}
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public static SingletonClone getObject(){
		if(obj==null){
			return obj=new SingletonClone();
		}
		return obj;
	}
}

public class CloneSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonClone obj=	SingletonClone.getObject();
		SingletonClone obj1=	SingletonClone.getObject();
		SingletonClone obj3=(SingletonClone) obj.clone();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj3.hashCode());
	}

}
