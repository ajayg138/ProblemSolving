class AvgMaxSubArray {
    //find maxsubarray...O(n)
    public double findMaxAverage(int[] nums, int k) {
        
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        
        
        int currentSum = maxSum;
        
        
        for (int i = k; i < nums.length; i++) {
            
            currentSum += nums[i] - nums[i - k];
           
            maxSum = Math.max(maxSum, currentSum);
        }
        
        
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        AvgMaxSubArray solution = new AvgMaxSubArray();
        
       
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        double result1 = solution.findMaxAverage(nums1, k1);
        System.out.println("The maximum average for Test Case 1 is: " + result1);
        
        
        int[] nums2 = {5, -10, 6, 9, 15};
        int k2 = 2;
        double result2 = solution.findMaxAverage(nums2, k2);
        System.out.println("The maximum average for Test Case 2 is: " + result2);
        
        
        int[] nums3 = {-1, -2, -3, -4, -5};
        int k3 = 1;
        double result3 = solution.findMaxAverage(nums3, k3);
        System.out.println("The maximum average for Test Case 3 is: " + result3);
    }
}
