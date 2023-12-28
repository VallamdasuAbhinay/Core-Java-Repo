package com.abhinay.pdf.files;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Removing_Specific_Page_From_PDF_Document {

	public static void main(String[] args) throws IOException {
		File pdfFile = new File("C:\\Users\\Admin\\Documents\\GitHub\\Core-Java-Repo\\Core_Java_PDF_Files_Examples\\ResponseSummary.pdf");
		PDDocument pdfDocument = Loader.loadPDF(pdfFile);
		System.out.println("Number of Pages in PDF Document Before Delete Operation = " + pdfDocument.getNumberOfPages());
		pdfDocument.removePage(5);
		/*
		 * For the above removePage() method we need to mention the specific page
		 * number, that will get removed from the PDF document. Since we have made
		 * changes to the existing PDF document (page removal) we need to save these
		 * changes hence, we called save method, and parameter to this save() method is
		 * the new pdf file so that all the new changes will gets saved in this
		 * specified new pdf file this will not make any changes to the originally
		 * loaded pdf file
		 */
		pdfDocument.save("C:\\Users\\Admin\\Documents\\GitHub\\Core-Java-Repo\\Core_Java_PDF_Files_Examples\\ResponseSummary_mod.pdf");
		System.out.println("Number of Pages in PDF Document After Delete Operation = " + pdfDocument.getNumberOfPages());
		pdfDocument.close();
	}

}
