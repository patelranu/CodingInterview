package com.interview;

public class Employe implements Comparable<Employe> {

	private int rating;
	private String name;
	private int age;
	private int salary;

	public Employe(int rating, String name, int age, int salary) {
		this.rating = rating;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emplyee [rating=" + rating + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employe emp) {
		if (this.age > emp.age) {
			return 1;
		} else if (this.age < emp.age) {
			return -1;
		} else
			return 0;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
		result = prime * result + salary;
		return result+this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	

}
