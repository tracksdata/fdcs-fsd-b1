package com;

import java.util.Collections;
import java.util.Objects;

public class Employee {

	private int empID;
	private String empName;
	private double salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, double salary) {
		
		this.empID = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee "+empName+" with  "+empID+" drawing "+salary+" salary per PM";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(empID);
	}

	@Override
	public boolean equals(Object obj) {

		
		
		Employee emp=(Employee)obj;
		
		
		return emp.getEmpId()==this.getEmpId() && emp.getEmpName().equals(this.getEmpName()) && emp.getSalary()==this.getSalary();
	}
	
	public int getEmpId() {
		return empID;
	}

	public void setEmpId(int empId) {
		this.empID = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
