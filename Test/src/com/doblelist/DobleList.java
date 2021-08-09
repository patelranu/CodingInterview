package com.doblelist;

class DBList{
	Node root;
	int size;
	
	DBList(){
		root=null;
		size=0;
	}

	public void insert(int val) {
		Node node=createNode(val);
		if(root==null)
		   root=node;	
		else{
			Node temp=root;
			temp.prev=node;
			node.next=temp;
			root=node;
		}
	}

	private Node createNode(int val) {
		Node obj=new Node(null,val,null);
		size++;
		return obj;
	
	}

	public void display() {
		if(root!=null){
			System.out.println("display records.....");
			 Node temp=root;
				for(int i=0;i<size;i++){
					System.out.println(temp.data);
					temp=temp.next;
				}
		}else
			System.out.println("list is empty............");
	}

	public void deleteAtBegin(){
		if(root!=null && size>1){
			root=root.next;
			root.prev=null;
			size--;
		}else if(root!=null && size==1){
			root=null;
			size--;
		}else
			System.out.println("list is empty............");
	   
	}

	public void deleteAtLast() {
		Node temp;
		temp=root;
		while(temp.next!=null){
			temp=temp.next;
		}
		if(temp.next==temp.prev){
			root=null;
		}else
			temp.prev.next=null;
		
		size--;
		
	}
}
public class DobleList {
	public static void main(String[] args) {
		DBList obj=new DBList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		//obj.insert(40);
		//obj.insert(5);
		obj.display();
		//obj.deleteAtBegin();
		//obj.display();
		//obj.deleteAtBegin();
		//obj.display();
		obj.deleteAtLast();
		obj.display();
		obj.deleteAtLast();
		obj.display();
		obj.deleteAtLast();
		obj.display();
		
	}

}
