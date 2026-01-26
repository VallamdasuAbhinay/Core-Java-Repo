/**
 * Given two version strings, version1 and version2, compare them. A version
 * string consists of revisions separated by dots '.'. The value of the revision
 * is its integer conversion ignoring leading zeros.
 * 
 * To compare version strings, compare their revision values in left-to-right
 * order. 
 * 
 * If one of the version strings has fewer revisions, treat the missing
 * revision values as 0.
 * 
 * Return the following:
 * 
 * If version1 < version2, return -1. 
 * If version1 > version2, return 1.
 * Otherwise, return 0.
 * 
 * 
 * Example 1:
 * 
 * Input: version1 = "1.2", version2 = "1.10"
 * 
 * Output: -1
 * 
 * Explanation:
 * 
 * version1's second revision is "2" and version2's second revision is "10": 2 <
 * 10, so version1 < version2.
 * 
 * Example 2:
 * 
 * Input: version1 = "1.01", version2 = "1.001"
 * 
 * Output: 0
 * 
 * Explanation:
 * 
 * Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
 * 
 * Example 3:
 * 
 * Input: version1 = "1.0", version2 = "1.0.0.0"
 * 
 * Output: 0
 * 
 * Explanation:
 * 
 * version1 has less revisions, which means every missing revision are treated
 * as "0".
 *
 * 
 * 
 */
public class CompareVersionNumbers_165 {

	public static void main(String[] args) {
		System.out.println("Comparing Versions...." + compareVersion("1.2", "1.10"));
		System.out.println("Comparing Versions...." + compareVersion("1.01", "1.001"));
		System.out.println("Comparing Versions...." + compareVersion("1.0", "1.0.0.0"));
	}

	public static int compareVersion(String version1, String version2) {
		int i = 0;
		int j = 0;
		int m = version1.length();
		int n = version2.length();

		while (i < m || j < n) {

			int sum1 = 0;
			while (i < m && version1.charAt(i) != '.') {
				sum1 = (sum1 * 10) + (version1.charAt(i) - '0');
				i++;
			}

			int sum2 = 0;
			while (j < n && version2.charAt(j) != '.') {
				sum2 = (sum2 * 10) + (version2.charAt(j) - '0');
				j++;
			}

			if (sum1 < sum2) {
				return -1;
			}

			if (sum1 > sum2) {
				return 1;
			}

			i++;
			j++;
		}
		return 0;
	}

}
