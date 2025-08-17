package java8_programs;

public class StudentClass {
	
	private String firstName;

	private String lastName;

	private String section;

	private String location;

	private String gender;

	public StudentClass(String firstName, String lastName, String section, String location, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.location = location;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentClass [firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
				+ ", location=" + location + ", gender=" + gender + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSection() {
		return section;
	}

	public String getLocation() {
		return location;
	}

	public String getGender() {
		return gender;
	}
	
	

}
