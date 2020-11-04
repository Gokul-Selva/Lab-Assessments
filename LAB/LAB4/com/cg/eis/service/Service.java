package com.cg.eis.service;

import java.util.Scanner;
import com.cg.eis.bean.Employee;

public class Service implements EmployeeService{

	@Override
	public Employee getEmployeeDetails() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the employee id: ");
		int id = in.nextInt();

		in.nextLine();
		System.out.print("Enter the employee name: ");
		String name = in.nextLine();
		System.out.print("Enter the employee salary: ");
		double salary = in.nextDouble();
		in.nextLine();
		System.out.print("Enter the designation of employee: ");
		String designation = in.nextLine();
		in.close();
	
		Employee employee = new Employee(id,name,salary,designation);

		return employee;
	}

	@Override
	public String findInsuranceScheme(Employee emp) {
		if(emp.getSalary()>0 && emp.getSalary()<=10000 && emp.getDesignation().equalsIgnoreCase("Analyst")) {
			return "Premium";
		}
		else if(emp.getSalary()>10000 && emp.getDesignation().equalsIgnoreCase("Consultant")) {
			return "Gold";
		}
		else
			return "Normal";
	}

	public void displayDetails(Employee emp) {
		System.out.println("***********Employee Details***********");
		System.out.println("ID: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Designation: "+emp.getDesignation());
		System.out.println("Loan Scheme: "+emp.getInsuranceScheme());
		
	}
}