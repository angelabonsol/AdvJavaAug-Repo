package com.cognixia.jump.intermediateJava.streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceStreams {

	List<Employee> employees = new ArrayList<Employee>();
	
	
	Employee lowestSalary = employees.stream()
								.reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2)
								.get();
	System.out.println("<== Employee w. lowest Salary ==>\n" + lowestSalary);
	
	String allDepartments = employees.stream()
			.map(Employee::getDepartment)
			.distinct() //for duplicate values 
			.reduce((dept1,dept2) -> dept1 + ", " + dept2)
			.get();
	
	System.out.println(allDepartments);
	
}
