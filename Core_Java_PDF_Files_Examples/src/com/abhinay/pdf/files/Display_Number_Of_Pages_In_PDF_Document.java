package com.abhinay.pdf.files;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Display_Number_Of_Pages_In_PDF_Document {

	public static void main(String[] args) throws IOException {
		File pdfFile = new File("C:\\Users\\Admin\\Desktop\\ResponseSummary.pdf");
		PDDocument pdfDocument = Loader.loadPDF(pdfFile);
		System.out.println("Number of Pages in PDF Document = " + pdfDocument.getNumberOfPages());
		pdfDocument.close();
	}

}
/*
 * Program to get the number of pages in an existing PDF document. The external
 * jar file is required to import in the program.
 * 
 * Following jar has been added to the build path of this project:
 * pdfbox-app-3.0.1.jar
 * 
 * List the number of pages that exists in the PDF document using the
 * getNumberOfPages() method
 */