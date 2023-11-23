package com.list;

class ArrayList {
	int size;
	Node root;

	ArrayList() {
		size = 0;
		root = null;
	}

	public void add(int value) {
		Node node = createNode(value);
		if (root == null) {
			root = node;
			
		} else {
			Node temp = root;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;

	}

	private Node createNode(int value) {

		return new Node(value, null);
	}

	public void print() {
		Node temp = root;
		System.out.println("display list..");
		for (int i = 0; i < size; i++) {
			System.out.println(" Data at index= "+ i +" is "+ temp.data);
			temp = temp.next;
		}
		

	}


	public void set(int index, int value) {
		Node node = createNode(value);
		Node temp=root;
		for(int i =0;i<index-1;i++){
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		size++;
		
	}
	
	public void delete(int index){
		System.out.println("data is deleted at index " + index);
		Node temp=root;
		for(int i=0;i<index-1;i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
		
	}

	public int size() {
		return size;
		
	}

}

public class ArrayListImpl {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(60);
		obj.set(3,40);
		obj.set(4,50);
		obj.print();
		obj.delete(3);
		obj.print();
		obj.delete(4);
		obj.add(90);
		obj.print();
		System.out.println("list size "+obj.size);

	}

}
