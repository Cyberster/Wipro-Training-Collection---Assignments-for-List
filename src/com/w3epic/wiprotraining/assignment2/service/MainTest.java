package com.w3epic.wiprotraining.assignment2.service;

import com.w3epic.wiprotraining.assignment2.bean.Employee;
import com.w3epic.wiprotraining.assignment2.bean.EmployeeDB;

public class MainTest {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Bob", "bob@w3epic.com", 'M', 25000);
		Employee emp2 = new Employee(102, "Alice", "alice@w3epic.com", 'F', 30000);
		Employee emp3 = new Employee(103, "John", "john@w3epic.com", 'M', 20000);
		Employee emp4 = new Employee(104, "Ram", "ram@w3epic.com", 'M', 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}
