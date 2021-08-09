package com.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

//order level traversal
//min and max value of tree
//level of tree
//delete a node in tree -pending
//height of the tree -pending
//check the tree is binary or not- pending
//infix postfix notation-pending
//
class BSTNode{
	Node root;
	int count;
	Queue<Node>que;
	
	int sum=0;
	BSTNode(){
		root=null;
		count=0;
		que=new LinkedList<>();
	}
	public void insert(int val) {
		root=insertAt(val,root);
	}
	private Node insertAt(int val, Node root) {
		if(root==null){
			return(createNode(val));
		}else if(root.data>val){
			root.left= insertAt(val,root.left);
		}else{
			root.right= insertAt(val,root.right);
		}
		return root;
		
	}
	private Node createNode(int val) {
		Node obj=new Node(val);
		return obj;
	}
	public void display() {
		//inorderData(root);
		
		postorder(root);
		//preorder(root);
		
	}
	private void preorder(Node root) {
		//root, left,right
		if(root!=null){
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
		
	}
	private void postorder(Node root) {
		//left right root
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
			sum=sum+root.data;
		}
		
		
	}
	private void inorderData(Node root) {
		//left,root,right
		if(root!=null){
			inorderData(root.left);
			System.out.println(root.data);
			inorderData(root.right);
		}
		
		
	}
	public void minNode() {
		Node temp=root;
		while(temp.left!=null)
			temp=temp.left;
		System.out.println(temp.data);
		
	}
	public void maxNode() {
		Node temp=root;
		while(temp.right!=null)
			temp=temp.right;
		System.out.println(temp.data);
		
	}
	public void sumofData() {
		System.out.println(sum);
		
	}
	public void levelOrder() {
		Node temp=root;
		if(temp==null){
			System.out.println("tree is empty....");
		}else{
			while(temp!=null){
			   if(que.size()==0)
				que.add(temp);
				Node node=popOperation(que);
				if(node.left!=null)
					que.add(node.left);
				if(node.right!=null)
					que.add(node.right);
				temp=que.peek();
				}
		}
}
		
	
	private Node popOperation(Queue<Node> que) {
		if(que.isEmpty()){
			System.out.println("queue is empty....");
			return null;
		}else{
		Node node=que.remove();
		System.out.println(node.data);
		return node;
	} 

}
	public void level() {
	  Node temp=root;
	  if(temp==null){
		  System.out.println("tree is empty");
	  }else{
			  que.add(root);
		  while(!que.isEmpty()){
			 Node node=que.remove();
			 System.out.println(node.data);
			 if(node.left!=null)
					que.add(node.left);
				if(node.right!=null)
					que.add(node.right);
		  }
		  
	  }
	}
}
public class BSTAdd {
	public static void main(String[] args) {
		BSTNode obj=new BSTNode();
		obj.insert(8);
		obj.insert(3);
		obj.insert(10);
		obj.insert(1);
		obj.insert(6);
		obj.insert(14);
		obj.insert(4);
		obj.insert(7);
		obj.insert(13);
		System.out.println("min value............");
		obj.minNode();
		System.out.println("max value.......");
		obj.maxNode();
		System.out.println("display data.......");
		obj.display();
		System.out.println("sum of data.........");
		obj.sumofData();
		//obj.levelOrder();
		obj.level();
	}

}
