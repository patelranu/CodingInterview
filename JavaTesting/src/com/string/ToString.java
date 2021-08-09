package com.string;
class Emp{
	int i;

	public Emp(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Emp [i=" + i + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (i != other.i)
			return false;
		return true;
	}
}

public class ToString {
	public static void main(String[] args) {
		Emp ob=new Emp(10);
		Emp ob1=new Emp(10);
		System.out.println(ob);
		System.out.println(ob.equals(ob1));
	}

}
