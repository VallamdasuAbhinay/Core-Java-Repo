/*
You are given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2]

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
*/

public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[p]) {
                p++;
                nums[p] = nums[j];
            }
        }
        return p + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 solution = new RemoveDuplicatesFromSortedArray_26();

        int[] nums1 = { 1, 1, 2 };
        int length1 = solution.removeDuplicates(nums1);
        System.out.println(length1); // Output: 2
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " "); // Output: 1 2
        }
        System.out.println();

        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int length2 = solution.removeDuplicates(nums2);
        System.out.println(length2); // Output: 5
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " "); // Output: 0 1 2 3 4
        }
    }
}
