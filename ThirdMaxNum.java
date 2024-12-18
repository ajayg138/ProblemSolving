import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Given an integer array nums, return the third distinct 
//maximum number in this array. If the third maximum does not exist, return the maximum number.
class ThirdMaxNum {
    public int thirdMax(int[] nums) {
        
        List<Integer> distinctNums = new ArrayList<>();
        for (int num : nums) {
            if (!distinctNums.contains(num)) {
                distinctNums.add(num);
            }
        }
        
        
        Integer[] distinctArray = distinctNums.toArray(new Integer[0]);
        Arrays.sort(distinctArray, (a, b) -> b - a);
        
        
        if (distinctArray.length >= 3) {
            return distinctArray[2];
        } else {
            return distinctArray[0]; 
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int[] nums1 = {3, 2, 1};
        System.out.println("Third maximum of [3, 2, 1]: " + solution.thirdMax(nums1)); 1

        
        int[] nums2 = {1, 2};
        System.out.println("Third maximum of [1, 2]: " + solution.thirdMax(nums2));
        
        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Third maximum of [2, 2, 3, 1]: " + solution.thirdMax(nums3));

        
        int[] nums4 = {1, 1, 1};
        System.out.println("Third maximum of [1, 1, 1]: " + solution.thirdMax(nums4)); 
    }
}
