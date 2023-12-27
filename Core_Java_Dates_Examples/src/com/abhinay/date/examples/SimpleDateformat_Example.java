package com.abhinay.date.examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateformat_Example {

	public static void main(String[] args) {

		String format1 = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(format1);
		String formattedDate = sdf.format(new Date());
		System.out.println("Printing date in the format of " + format1 + " --> " + formattedDate);
		// Output 15-09-2023

		String format2 = "dd-MMM-yyyy";
		SimpleDateFormat sdf2 = new SimpleDateFormat(format2);
		String formattedDate2 = sdf2.format(new Date());
		System.out.println("Printing date in the format of " + format2 + " --> " + formattedDate2);
		// Output 15-Sep-2023

		String format3 = "dd-MMMM-yyyy";
		SimpleDateFormat sdf3 = new SimpleDateFormat(format3);
		String formattedDate3 = sdf3.format(new Date());
		System.out.println("Printing date in the format of " + format3 + " --> " + formattedDate3);
		// Output 15-September-2023

		String format4 = "MMMM-dd-yyyy";
		SimpleDateFormat sdf4 = new SimpleDateFormat(format4);
		String formattedDate4 = sdf4.format(new Date());
		System.out.println("Printing date in the format of " + format4 + " --> " + formattedDate4);
		// Output September-15-2023

		String format5 = "MMM-dd-yyyy";
		SimpleDateFormat sdf5 = new SimpleDateFormat(format5);
		String formattedDate5 = sdf5.format(new Date());
		System.out.println("Printing date in the format of " + format5 + " --> " + formattedDate5);
		// Output Sep-15-2023
	}

}
