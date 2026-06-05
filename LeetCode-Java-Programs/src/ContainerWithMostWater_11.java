
/**
 * 11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Notice that you may not slant the container.
 *  
 * Example 1:
 * * Input: height = [1,8,6,2,5,4,8,3,7]
 * * Output: 49
 * * * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * * Example 2:
 * * Input: height = [1,1]
 * * * Output: 1
 * * * Explanation: The above vertical lines are represented by array [1,1]. In this case, the max area of water (blue section) the container can contain is 1.
 * * Example 3:
 * * * Input: height = [4,3,2,1,4]
 * * * Output: 16
 * * * Explanation: The above vertical lines are represented by array [4,3,2,1,4]. In this case, the max area of water (blue section) the container can contain is 16.
 * * * Example 4:
 * * * Input: height = [1,2,1]
 * * * * Output: 2
 * * * * Explanation: The above vertical lines are represented by array [1,2,1]. In this case, the max area of water (blue section) the container can contain is 2.
 * *
 * * Constraints:
 * * * n == height.length
 * * * 2 <= n <= 10^5
 * * * 0 <= height[i] <= 10^4
 */
public class ContainerWithMostWater_11 {
    
    public static void main(String[] args) {
        int[] heightArray = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(heightArray);
        System.out.println("Result...." + result);
    }

    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (leftPointer < rightPointer) {
            int currentArea = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            maxArea = Math.max(maxArea, currentArea);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;
    }

}
