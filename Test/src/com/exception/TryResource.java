package com.exception;
class ShowError extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ShowError(String ex){
		super(ex);
	}
	
}

class A implements AutoCloseable{
	
	public int  show(){
		int a=10;
		if(a<9){
			throw new ShowError("a is not grater than....."+this.hashCode());
		}else
			return a;
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("close"+this.hashCode());
		
	}
	
}

public class TryResource {
	public static void main(String[] args) throws Exception {
	
		try(A obj=new A()){
			System.out.println(obj.show()+"welcome to the application....");
		}	
		
	}

}
