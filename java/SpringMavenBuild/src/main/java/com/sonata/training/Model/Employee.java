package com.sonata.training.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {
    @Id
    
    long empID;
    String employeeName;
    double employeeSal;
    
    Employee() {}

	public Employee(long empID, String employeeName, double employeeSal) {
		super();
		this.empID = empID;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}

	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSal() {
		return employeeSal;
	}

	public void setEmployeeSal(double employeeSal) {
		this.employeeSal = employeeSal;
	}
    

}