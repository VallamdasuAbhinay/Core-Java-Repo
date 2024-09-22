package Java8_Examples;

public class EmployeeClass {

	private String firstName;

	private String lastName;

	private String department;

	private String location;

	private double salary;

	public EmployeeClass(String firstName, String lastName, String department, String location, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.location = location;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public String getLocation() {
		return location;
	}

	public double getSalary() {
		return salary;
	}
	
	

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeClass [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", location=" + location + ", salary=" + salary + "]";
	}
}
