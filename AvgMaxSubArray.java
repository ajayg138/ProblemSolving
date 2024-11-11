class AvgMaxSubArray {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first 'k' elements
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        
        // Initialize the current sum as the max sum for the first window
        int currentSum = maxSum;
        
        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            // Update the current sum by sliding the window
            currentSum += nums[i] - nums[i - k];
            // Track the maximum sum encountered
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Return the maximum average
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        AvgMaxSubArray solution = new AvgMaxSubArray();
        
        // Test Case 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        double result1 = solution.findMaxAverage(nums1, k1);
        System.out.println("The maximum average for Test Case 1 is: " + result1);
        
        // Test Case 2
        int[] nums2 = {5, -10, 6, 9, 15};
        int k2 = 2;
        double result2 = solution.findMaxAverage(nums2, k2);
        System.out.println("The maximum average for Test Case 2 is: " + result2);
        
        // Test Case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int k3 = 1;
        double result3 = solution.findMaxAverage(nums3, k3);
        System.out.println("The maximum average for Test Case 3 is: " + result3);
    }
}
