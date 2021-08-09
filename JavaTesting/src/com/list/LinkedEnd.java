package com.list;
class LinkEnd{
	Node root,temp;
	int size;
	LinkEnd(){
		root=null;
		size=0;
	}
	public void insertAtEnd(int val) {
		Node node=createNode(val);
		if(root==null){
			root=node;
		}else{
			temp=root;
			while(temp.next!=null)
				temp=temp.next;
		temp.next=node;
		}
		
	}
	private Node createNode(int val) {
		Node obj=new Node(val,null);
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
	public void insertAt(int data, int pos) {
		 Node node=  createNode(data);
		 Node temp=root;
		 for(int i=1;i<pos-1;i++){
			 temp=temp.next;
		 }
		  node.next=temp.next;
		  temp.next=node;
	}
	public void insertAtPos(int data, int pos) {
		Node node=createNode(data);
		Node prev,temp;
		temp=root;
		prev=null;
		for(int i=0;i<=pos-2;i++){
		    prev=temp;
		    temp=temp.next;
		}
		node.next=temp;
		prev.next=node;
		
	}
	 public void deleteAtPosition(int pos){
		 Node temp, prev;
		 temp=root;
		 prev=null;
		 for(int i=0;i<pos-1;i++){
			 prev=temp;
			 temp=temp.next;
		 }
		 prev.next=temp.next;
		 size--;
	
	}
	public void deleteAt(int pos) {
		Node temp=root;
		for(int i=1;i<pos-1;i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
	}
	 
	
}
public class LinkedEnd {
	public static void main(String[] args) {
		LinkEnd obj=new LinkEnd();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
	    obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.displayrecord();
		System.out.println("insert at postion 3");
		obj.insertAt(5,3);
		obj.insertAt(6,4);
		obj.insertAt(7,5);
		//obj.insertAtPos(5,3);
		obj.displayrecord();
		System.out.println("delete at  postion 4");
		obj.deleteAt(4);
		obj.displayrecord();
		/*System.out.println("delete at  postion 4");
		obj.deleteAtPosition(4);
		obj.displayrecord();
		System.out.println("delete at  postion 2");
		obj.deleteAtPosition(2);
		obj.displayrecord();
		System.out.println("insert at the end");
		obj.insertAtEnd(9);
		obj.displayrecord();*/
		

	}

}
