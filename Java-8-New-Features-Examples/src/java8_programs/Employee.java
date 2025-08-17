package java8_programs;

public class Employee {

	private String emp_name;

	private String emp_location;

	private Integer emp_id;

	public Employee(String emp_name, String emp_location, Integer emp_id) {
		this.emp_name = emp_name;
		this.emp_location = emp_location;
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public String getEmp_location() {
		return emp_location;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_location=" + emp_location + ", emp_id=" + emp_id + "]";
	}

}
