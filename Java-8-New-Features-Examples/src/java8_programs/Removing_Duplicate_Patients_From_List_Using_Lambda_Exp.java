package java8_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Removing_Duplicate_Patients_From_List_Using_Lambda_Exp {

	public static void main(String[] args) {
		List<Patient> patientsList = new ArrayList<Patient>();

		patientsList.add(new Patient("Sathish", 200200));
		patientsList.add(new Patient("Kumar", 200200));
		patientsList.add(new Patient("Sai", 786442));
		patientsList.add(new Patient("Sreekar", 200200));
		patientsList.add(new Patient("Dinesh", 200200));
		// filtering all the patients whose number is greater than 400000 and printing
		// on console
		patientsList.stream().filter(e -> e.patientNum.intValue() > 400000).forEach(System.out::println);
		System.out.println("---------------------");
		// Collecting all the patient numbers into the list and printing on console
		List<Number> patientNumbersList = patientsList.stream().map(Patient::getPatientNum)
				.collect(Collectors.toList());
		System.out.println("Patient Numbers List (Duplicates Included):: " + patientNumbersList);
		// Collecting all the patient numbers into the list and again applying the
		// distinct() and
		// count() functions on the list, to remove the duplicate entries
		// and this count printed on console
		long count = patientsList.stream().map(Patient::getPatientNum).collect(Collectors.toList()).stream().distinct()
				.count();
		System.out.println("Patient Numbers Count (Duplicates Excluded)....." + count);
	}

}

class Patient {

	public String patientName;

	public Number patientNum;

	public Patient(String patientName, Number patientNum) {
		super();
		this.patientName = patientName;
		this.patientNum = patientNum;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Number getPatientNum() {
		return patientNum;
	}

	public void setPatientNum(Number patientNum) {
		this.patientNum = patientNum;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientNum=" + patientNum + "]";
	}

}
