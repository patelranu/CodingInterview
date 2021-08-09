package com.binarySearchTree;
class BSNode{
	Node root;
	int level;
	int right;
	BSNode(){
		root=null;
		level=0;
		right=0;
	}
	public Node insert(int val,Node root) {
		if(root==null){
			return(createNode(val));
		}else if(root.data>val){
			root.left=insert(val,root.left);
		}else{
			root.right=insert(val,root.right);
		}
		return root;
}
	private Node createNode(int val) {
		Node obj=new Node(val);
		return obj;
	}
	public void add(int val) {
		root=insert(val,root);
	}
	public void printData() {
	    preorder(root);
		//postorder(root);
		//inorder(root);
		
		
		
	}
	//left,root,right
	private void inorder(Node root) {
		if(root!=null){
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
			
		}
		
	}
	//left,right,root
	private void postorder(Node root) {
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
		
	}
	//root,left,right
	private void preorder(Node root) {
		if(root!=null){
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
		
	}
	public void minval() {
		min(root);
		
	}
	private void min(Node root) {
		while(root.left!=null){
			root=root.left;
		}
		System.out.println(root.data);
		
	}
	public void maxval() {
		max(root);
		
	}
	private void max(Node root) {
		while(root.right!=null){
			root=root.right;
		}
		System.out.println(root.data);
	}
	public void level() {
		leftLevel(root);
		rightLevel(root);
		
	}
	private void leftLevel(Node root) {
		left(root.left);
		
	}
	private void rightLevel(Node root) {
		right(root.right);
		
	}
	private void right(Node root) {
		if(root.left!=null ||root.right !=null){
	    	if(root.left!=null){
	    		right++;
	    		left(root.left);
	    		
	    	}else{
	    		right++;
	    		left(root.right);
	    		
	    	}
	    }
	}
	private void left(Node root) {
		if(root.left!=null ||root.right !=null){
	    	if(root.left!=null){
	    		level++;
	    		left(root.left);
	    	}else{
	    		level++;
	    		left(root.right);
	    		
	    	}
	    }
		
	}
	public void treeLevel() {
		if(level>right){
			System.out.println("level of ltree is :"+(++level));
		}else{
			System.out.println("level of rtree is :"+(++right));
		}
		
	}
	
}
public class BST {
	public static void main(String[] args) {
		    BSNode obj=new BSNode();
               obj.add(10);
               obj.add(5);
               obj.add(3);
               obj.add(20);
               obj.add(15);
               obj.add(25);
               obj.add(2);
               obj.printData();
               obj.minval();
               obj.maxval();
               obj.level();
               obj.treeLevel();
	}

	

}
