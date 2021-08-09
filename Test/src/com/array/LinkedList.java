package com.array;

class NodeList{
	NodeObject root;
	int size;
	public NodeList() {
		root=null;
		size=0;
	}
	
	public void add(int value) {
		if(root==null)
			root=createNode(value);
		else{
		NodeObject obj=createNode(value);
		obj.next=root;
		root=obj;
		}
	}
	private NodeObject createNode(int value) {
		NodeObject obj=new NodeObject(value,null);
		size++;
		return obj;
		
		
	}
	public void print() {
		NodeObject temp=root;
		for(int i=0;i<size;i++){
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		
	}
	
}

public class LinkedList {
	public static void main(String[] args) {
		NodeList obj=new NodeList();
		obj.add(10);
		obj.add(20);   
		obj.add(30);
		obj.print();
	}

}
