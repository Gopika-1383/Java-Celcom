package com.celcom.day2;

class Employee {
	int employeeId;
	String ename;
	double employeeSalary;
	
	Employee ( int id, String name, double salary) {
		employeeId = id;
		ename = name;
		employeeSalary = salary;
	}
	void display () {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee Salary : " + employeeSalary);
	}
}



public class ClassObjectExample {

	public static void main(String[] args) {
		Employee gops = new Employee(101, "Gopika", 2000);
		gops.display();
		
		Employee alagar = new Employee(102, "Alagar", 5000);
		alagar.display();
	}

}
