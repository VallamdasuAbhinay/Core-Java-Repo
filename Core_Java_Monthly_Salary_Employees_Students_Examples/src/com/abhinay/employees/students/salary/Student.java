package com.abhinay.employees.students.salary;

public class Student implements Payee {

	public String id;

	public String name;

	public String college;

	public Student() {

	}

	public Student(String id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

	@Override
	public double getCompensation() {
		return 100;
	}

	@Override
	public String payeeNumber() {
		return id;
	}

}
