package abhinay.builder.pattern;

public class ElectronicsStore {

	public static void main(String[] args) {
		//In this case, we have to pass all the parameters that are required to create the
		//object of the Phone class and that too, these parameters should be passed in the
		//proper sequence as mentioned in the parameterized constructor of Phone class.
		//This way of creating the object will be easy if we have only few parameters and 
		//this process gets much more complex to maintain once we have more number of
		//parameters
		Phone phoneObj = new Phone("Samsung Galaxy M52", "2024 Model", 32900.0, 5000, "Qualcomm", "One UI");
		System.out.println("Printing Phone Object Details....\n" + phoneObj);
		
		//In this case, we are following Builder Design Pattern
		//more details provided in package-info.java file
		Phone phoneInstance = new PhoneBuilder().setPhoneName("iPhone 15 Max Pro").setPhoneOS("iOS").createPhone();
		System.out.println("Printing Phone Object Details....\n" + phoneInstance);
		
		Phone phoneInstance2 = new PhoneBuilder().setPhoneName("Oppo A16").setPhonePrice(24865d).createPhone();
		System.out.println("Printing Phone Object Details....\n" + phoneInstance2);
		
	}

}
