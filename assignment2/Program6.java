package com.celcom.assignment2;
 
class Employee {
	String name;
	String jobtitle;
	double salary;
	
	Employee (String name, String jobtitle, double salary) {
		this.name = name;
		this.jobtitle = jobtitle;
		this.salary = salary;
	}
	void calculateSalary (double salary) {
		double hra = 0.2 * salary;
		double da = 0.3 * salary;
		double sa = 0.1 * salary;
		
		double gross = salary + hra + da + sa;
		System.out.println("Salary  " + name + " with job " + jobtitle + " is " + gross );
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class Program6 {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Gopika", "Junior Consultant", 45000.0);
		employee.calculateSalary(45000.0);
		
		System.out.println();
		employee.calculateSalary(55000.0);
		
		

	}

}
