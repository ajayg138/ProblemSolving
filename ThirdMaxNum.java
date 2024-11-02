import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThirdMaxNum {
    public int thirdMax(int[] nums) {
        // Step 1: Remove duplicates by adding elements to a list only if they are unique
        List<Integer> distinctNums = new ArrayList<>();
        for (int num : nums) {
            if (!distinctNums.contains(num)) {
                distinctNums.add(num);
            }
        }
        
        // Step 2: Convert list to an array and sort it in descending order
        Integer[] distinctArray = distinctNums.toArray(new Integer[0]);
        Arrays.sort(distinctArray, (a, b) -> b - a);
        
        // Step 3: Check if there are at least 3 distinct elements
        if (distinctArray.length >= 3) {
            return distinctArray[2]; // Return the third maximum
        } else {
            return distinctArray[0]; // Return the maximum
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {3, 2, 1};
        System.out.println("Third maximum of [3, 2, 1]: " + solution.thirdMax(nums1)); // Expected output: 1

        // Test Case 2
        int[] nums2 = {1, 2};
        System.out.println("Third maximum of [1, 2]: " + solution.thirdMax(nums2)); // Expected output: 2

        // Test Case 3
        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Third maximum of [2, 2, 3, 1]: " + solution.thirdMax(nums3)); // Expected output: 1

        // Additional Test Case
        int[] nums4 = {1, 1, 1};
        System.out.println("Third maximum of [1, 1, 1]: " + solution.thirdMax(nums4)); // Expected output: 1
    }
}
