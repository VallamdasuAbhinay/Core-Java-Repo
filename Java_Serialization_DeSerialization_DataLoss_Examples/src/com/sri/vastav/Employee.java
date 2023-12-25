package com.sri.vastav;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4935370860535923128L;

	private String empID;

	private String empName;

	private String empLocation;

	private String empDesignation;
	/*
	 * if we declare a particular variable as transient, it means that value of that
	 * particular variable will not be serialized and also the original value of
	 * that variable will not be stored anywhere.
	 * 
	 * As we declared empSalary as transient, it means this object property will not
	 * be serialized, and after De-Serialization, if we access that variable
	 * (empSalary), it will show only default value as 0.0 (which means the original
	 * value of that variable is lost)
	 * 
	 * For Strings it will show as null after De-Serialization
	 */
	private transient double empSalary;

	/**
	 * @return the empID
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empLocation
	 */
	public String getEmpLocation() {
		return empLocation;
	}

	/**
	 * @param empLocation the empLocation to set
	 */
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}

	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empLocation=" + empLocation
				+ ", empDesignation=" + empDesignation + ", empSalary=" + empSalary + "]";
	}

}
