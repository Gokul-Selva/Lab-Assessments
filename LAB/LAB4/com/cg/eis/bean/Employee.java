/**
 * Desc: Employee class to hold employee id, name, salary, designation and loan scheme.
 * @author Gokul S
 *
 */
package com.cg.eis.bean;
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	

	public Employee(int id,String name,double salary,String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public String getInsuranceScheme() {
		return this.insuranceScheme;
	}
	

	public int getId() {
		return id;
	}
	
	public String getName() {
		return this.name;
	}
	

	public double getSalary() {
		return this.salary;
	}
	

	public String getDesignation() {
		return this.designation;
	}
}