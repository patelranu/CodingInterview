package com.list;

class Linked{
	Node root;
	int size;
	public Linked() {
		root=null;
		size=0;
	}
	//implement linked list using stack means insert at begin
	public void insertAtBegin(int data) {
		Node node=createNode(data);
		if(root==null)
			root=node;
		else{
			node.next=root;
			root=node;
		}
	}
	private Node createNode(int data) {
		Node obj=new Node(data,null);
		size++;
		return obj;
	}
	public void displayrecord() {
		Node temp=root;
		for(int i=0;i<size;i++){
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	public void deleteAtFirst(){
		if(root==null)
			System.out.println("list is empty.............");
		else{
			size--;
			root=root.next;
		}
		
		
	}
	public void deleteAtLast() {
		if(root==null)
			System.out.println("list is empty........");
		else{
			Node temp, prev;
			temp=root;
			prev=null;
			while(temp.next!=null){
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
			size--;
		}
		
	}
	public void getSizeList() {
		System.out.println("size :"+size);
		
	}
}
public class LinkedList {
	public static void main(String[] args){
		System.out.println("insert at beginig");
		Linked obj=new Linked();
		obj.insertAtBegin(10);
		obj.insertAtBegin(9);
		obj.insertAtBegin(8);
		obj.insertAtBegin(7);
		obj.insertAtBegin(6);
		obj.insertAtBegin(5);
		obj.insertAtBegin(4);
		obj.insertAtBegin(3);
		obj.displayrecord();
		System.out.println("delete at first postion");
		obj.deleteAtFirst();
		obj.displayrecord();
		System.out.println("delete at last postion.....");
		obj.deleteAtLast();
		obj.displayrecord();
		obj.getSizeList();
		
		
	}

}
