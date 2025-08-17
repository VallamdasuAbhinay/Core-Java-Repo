package java8_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Adding_Data_From_Custom_Objects_To_New_Map_Using_Lambda_Exp {

	static List<CompanyEmployee> employeesList = new ArrayList<CompanyEmployee>();

	static {
		employeesList.add(new CompanyEmployee("Abhinay", "Vallamdasu", "Hyderabad", 200000l));
		employeesList.add(new CompanyEmployee("Sai", "Kumar", "Chennai", 150000l));
		employeesList.add(new CompanyEmployee("Jeshwin", "Vallamdasu", "Bangalore", 140000l));
		employeesList.add(new CompanyEmployee("Shashank", "Kumar", "Delhi", 120000l));
		employeesList.add(new CompanyEmployee("Ananth", "Ambani", "Mumbai", 110000l));
	}

	public static void main(String[] args) {
		System.out.println("Starting Adding_Data_From_Custom_Objects_To_New_Map_Using_Lambda_Exp....");
		System.out.println("Contents of employeesList are \n" + employeesList);
		Map<String, String> employeesMap = new HashMap<String, String>();
		System.out.println("Contents of employeesMap before using Lambda Expression \n" + employeesMap);
//		using method reference approach to assign the data to existing hashmap
		employeesMap = employeesList.stream().filter(f -> f.getEmpSalary() > 120000l)
				.collect(Collectors.toMap(CompanyEmployee::getEmpFirstName, CompanyEmployee::getEmpLastName));

//		2nd approach using forEach to add data to new hashmap
//		employeesList.stream().filter(f -> f.getEmpSalary() > 120000l)
//		.forEach(f -> employeesMap.put(f.getEmpFirstName(), f.getEmpLastName()));

		System.out.println("Contents of employeesMap after using Lambda Expression \n" + employeesMap);
	}

}

class CompanyEmployee {
	public String empFirstName;
	public String empLastName;
	public String empLocation;
	public Long empSalary;

	public CompanyEmployee(String empFirstName, String empLastName, String empLocation, Long empSalary) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empLocation = empLocation;
		this.empSalary = empSalary;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "CompEmployee [empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", empLocation="
				+ empLocation + ", empSalary=" + empSalary + "]";
	}

}
