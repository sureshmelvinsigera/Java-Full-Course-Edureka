package com.edurekamodule3;

public class Employee extends Manager{
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.salary = 1000;
		System.out.println("Salary of employee is: " + emp.salary);
		
		Manager man = new Manager();
		man.salary = 200;
		System.out.println("Salary of manager is: " + man.salary);
	}
}
