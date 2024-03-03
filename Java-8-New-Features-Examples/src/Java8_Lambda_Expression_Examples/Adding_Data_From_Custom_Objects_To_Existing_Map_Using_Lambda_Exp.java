package Java8_Lambda_Expression_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adding_Data_From_Custom_Objects_To_Existing_Map_Using_Lambda_Exp {

	static List<CompEmployee> employeesList = new ArrayList<CompEmployee>();

	static {
		employeesList.add(new CompEmployee("Abhinay", "Vallamdasu", "Hyderabad", 200000l));
		employeesList.add(new CompEmployee("Sai", "Kumar", "Chennai", 150000l));
		employeesList.add(new CompEmployee("Jeshwin", "Vallamdasu", "Bangalore", 140000l));
		employeesList.add(new CompEmployee("Shashank", "Kumar", "Delhi", 120000l));
		employeesList.add(new CompEmployee("Ananth", "Ambani", "Mumbai", 110000l));
	}

	public static void main(String[] args) {
		System.out.println("Starting Adding_Data_From_Custom_Objects_To_Existing_Map_Using_Lambda_Exp....");
		System.out.println("Contents of employeesList are \n" + employeesList);
		Map<String, String> employeesMap = new HashMap<String, String>();
		employeesMap.put("1", "One");
		employeesMap.put("2", "Two");
		employeesMap.put("3", "Three");
		employeesMap.put("4", "Four");
		System.out.println("Contents of employeesMap before using Lambda Expression \n" + employeesMap);
//		1st approach to add data to existing hashmap using forEach
		employeesList.stream().filter(f -> f.getEmpSalary() > 120000l)
				.forEach(f -> employeesMap.put(f.getEmpFirstName(), f.getEmpLastName()));
		
//		2nd approach to add data to existing hashmap using method reference
//		employeesMap = employeesList.stream().filter(f -> f.getEmpSalary() > 120000l).
//				collect(Collectors.toMap(CompEmployee::getEmpFirstName, CompEmployee::getEmpLastName));
		System.out.println("Contents of employeesMap after using Lambda Expression \n" + employeesMap);
	}

}

class CompEmployee {
	public String empFirstName;
	public String empLastName;
	public String empLocation;
	public Long empSalary;

	public CompEmployee(String empFirstName, String empLastName, String empLocation, Long empSalary) {
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
