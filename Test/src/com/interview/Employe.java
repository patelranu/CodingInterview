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

}
