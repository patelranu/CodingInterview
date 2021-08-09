package com.array;

public class NodeObject {
	int data;
	NodeObject next;
	
	public NodeObject() {
		
	}
	public NodeObject(int data, NodeObject next) {
		
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeObject getNext() {
		return next;
	}
	public void setNext(NodeObject next) {
		this.next = next;
	}
	

}
