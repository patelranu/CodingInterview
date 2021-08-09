package com.stack;
//array implementation of stack
class StackOp{
	int size, top;
	int a[];
	static final int max=7;
	StackOp(){
		size=0;
		top=-1;
		a=new int[max];
	}
	public void push(int val) {
		if(top==max-1)
			System.out.println("stack is overflow......");
		else{
			a[++top]=val;
			size++;
		}
	}
	public void pop() {
	    if(top==-1)
	    	System.out.println("stack is empty..........");
	    else{
	    	top=top-1;
	    	size--;
	    }
	}
	public void display() {
		System.out.println("size :     "+size);
		System.out.println("print from bottom to top.......");
		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}
		/*System.out.println("top to bottom...........");
		for(int i=size-1;i>=0;i--){
			System.out.println(a[i]);
		}*/
	}
	public void sorting() {
		int size=this.size;
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1-i;j++){
				if(a[this.top-i]<a[this.top-1-j-i]){
					int temp=a[this.top-i];
					a[this.top-i]=a[this.top-1-j-i];
					a[this.top-1-j-i]=temp;
				}
			}
			
			
			
		}
		
	}
}
public class StackImpl {
	public static void main(String[] args) {
		StackOp obj=new StackOp();
		obj.push(10);
		obj.push(2);
		obj.push(7);
		obj.push(6);
		obj.push(5);
		obj.push(1);
		obj.push(12);
		obj.display();
		obj.pop();
		obj.display();
		obj.sorting();
		obj.display();
		
		//obj.pop();
		//obj.pop();
		//obj.pop();
		//obj.push(60);
		//obj.display();
	    //obj.pop();
	    //obj.display();
		
		
		
		
		
		
		
		
		
	}

}
