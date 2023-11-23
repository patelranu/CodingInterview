package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BNPRating {
	public static void main(String[] args) {
		HashMap<Employe,String> map=new HashMap<>();
		map.put(new Employe(3, "emp1", 25, 15000), "ranu");
		map.put(new Employe(3, "emp1", 25, 15000), "rash");
		//Employe class not implement hashcode so size should be 2
        System.out.println(map.size());
		
		//second part
		List<Employe> empList = new ArrayList<>();
		empList.add(new Employe(3, "emp1", 25, 15000));
		empList.add(new Employe(7, "emp2", 23, 10000));
		empList.add(new Employe(8, "emp3", 21, 5000));
		empList.add(new Employe(4, "emp4", 20, 9000));
		Collections.sort(empList);
	empList.stream().map(BNPRating::updatedSalary).forEach(emp -> System.out.println(emp.toString()));

	}

	public static Employe updatedSalary(Employe emp) {
		// rating 8-10 30
		// 4-6
		if (emp != null) {
			if (emp.getRating() >= 8 && emp.getRating() <= 10) {
				int currentSalary = emp.getSalary();
				int salaryHike = currentSalary * 30 / 100;
				emp.setSalary(currentSalary + salaryHike);

			} else if (emp.getRating() >= 4 && emp.getRating() <= 6) {
				int currentSalary = emp.getSalary();
				int salaryHike = currentSalary * 20 / 100;
				emp.setSalary(currentSalary + salaryHike);
			} else {
				int currentSalary = emp.getSalary();
				int salaryHike = currentSalary * 10 / 100;
				emp.setSalary(currentSalary + salaryHike);
			}
		}

		return emp;

	}

}
