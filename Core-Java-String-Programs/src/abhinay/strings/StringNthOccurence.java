package abhinay.strings;

public class StringNthOccurence {

	public static void main(String[] args) {
		String str = "abhinay,sri,vastav";
		if (str.contains("sri")) {
			System.out.println("The word sri exists in the " + str);
		}

		System.out.println("Welcome............");
		String batchID = "aR_Invoice_2020P05_20200221071138";
		String fileName = "ar_invoice_kermit_extract.dat";
		char pattern = '_';
		int occurence = 2;

		if (batchID.toUpperCase().contains("VPSP100")) {
			int startPosition = findNthOccurence(fileName, pattern, occurence) + 1;
			int substringLength = (findNthOccurence(batchID, pattern, 3) - 2)
					- (findNthOccurence(batchID, pattern, 2) + 1);
			System.out.println(
					"VPSP100 startPosition......." + startPosition + "\nsubstringLength...." + substringLength);
			System.out.print(findNthOccurence(fileName, pattern, occurence));
			// System.out.println("Substring........."+ batchID.substring(startPosition,
			// substringLength));
			StringBuffer strBuffer = new StringBuffer("");
			System.out.println("before....." + strBuffer.length());
			for (int i = startPosition;; i++) {
				strBuffer.append(batchID.charAt(i));
				if (strBuffer.length() - 1 > substringLength) {
					break;
				}
			}
			System.out.println(strBuffer);
		}

		if (batchID.toUpperCase().contains("FBDI") || batchID.toUpperCase().contains("KERMIT")
				|| batchID.toUpperCase().contains("LCA")) {
			int startPosition = findNthOccurence(fileName, pattern, occurence) + 1;
			int substringLength = (findNthOccurence(fileName, pattern, 3) - 2)
					- (findNthOccurence(fileName, pattern, 2) + 1);
			System.out.println("Start Position......." + startPosition + "\nSubstring Length...." + substringLength);
			System.out.print(findNthOccurence(fileName, pattern, occurence));
			// System.out.println("Substring........."+ batchID.substring(startPosition,
			// substringLength));
			StringBuffer strBuffer = new StringBuffer("");
			System.out.println("StringBuffer Length Before Appending Characters....." + strBuffer.length());
			for (int i = startPosition;; i++) {
				strBuffer.append(fileName.charAt(i));
				if (strBuffer.length() - 1 > substringLength) {
					break;
				}
			}
			System.out.println(strBuffer);
		}

		if (batchID.toUpperCase().contains("COUPA")) {
			int startPosition = findNthOccurence(fileName, pattern, 1) + 1;
			int substringLength = (findNthOccurence(fileName, pattern, 2) - 2)
					- (findNthOccurence(fileName, pattern, 1) + 1);
			System.out.println("Start Position......." + startPosition + "\nSubstring Length...." + substringLength);
			System.out.print(findNthOccurence(fileName, pattern, occurence));
			// System.out.println("Substring........."+ batchID.substring(startPosition,
			// substringLength));
			StringBuffer strBuffer = new StringBuffer("");
			System.out.println("StringBuffer Length Before Appending Characters....." + strBuffer.length());
			for (int i = startPosition;; i++) {
				strBuffer.append(fileName.charAt(i));
				if (strBuffer.length() - 1 > substringLength) {
					break;
				}
			}
			System.out.println(strBuffer);
		}

		if (batchID.toUpperCase().contains("AR")) {
			System.out.println("batchID...."+batchID);
			int startPosition = findNthOccurence(batchID, pattern, 1) + 1;
			int substringLength = (findNthOccurence(batchID, pattern, 2) - 2)
					- (findNthOccurence(batchID, pattern, 1) + 1);
			System.out.println("Start Position......." + startPosition + "\nSubstring Length...." + substringLength);
			StringBuffer strBuffer = new StringBuffer("");
			System.out.println("StringBuffer Length Before Appending Characters....." + strBuffer.length());
			for (int i = startPosition;; i++) {
				strBuffer.append(batchID.charAt(i));
				if (strBuffer.length() - 1 > substringLength) {
					break;
				}
			}
			System.out.println(strBuffer);
		}

	}

	// Function to find the
	// Nth occurrence of a character
	static int findNthOccurence(String str, char ch, int N) {
		int occur = 0;

		// Loop to find the Nth
		// occurrence of the character
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				occur += 1;
			}
			if (occur == N)
				return i;
		}
		return -1;
	}

}
