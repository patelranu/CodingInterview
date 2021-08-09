package com.list;

class ReverseList{
	Node root,temp;
	int size;
	
	ReverseList(){
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
	public void reverselist() {
      Node prev,current,next;
      prev=null;
      current=root;
     
      while(current!=null){
    	  next=current.next;
    	  current.next=prev;
    	  prev=current;
    	  current=next;
      }
       root=prev;
	}
}

public class Reverse {
	public static void main(String[] args) {
		ReverseList obj=new ReverseList();
		System.out.println("insert at position........");
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
	    obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);
		obj.displayrecord();
		System.out.println("reverse list........");
		obj.reverselist();
		obj.displayrecord();
	}

}
