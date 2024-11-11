public class MaxSubArrray{

    // //Brute Force Approach...
    // public static int maxSubarr(int[] arr){
    //     int maxSum=Integer.MIN_VALUE;

    //     for(int i=0;i<arr.length;i++){
    //         int currentSum=0;

    //         for(int j=i;j<arr.length;j++){
    //             currentSum += arr[j];
    //             maxSum = Integer.max(maxSum,currentSum);
    //         }
    //     }

    //     return maxSum;
    // }


//optimal solution using kadane's algorithm

public static int maxSubarr(int[] arr){
    int maxSum=arr[0];
    int currentSum=arr[0];

    for(int i=1;i<arr.length;i++){
        currentSum=Math.max(arr[i],currentSum+arr[i]);
        maxSum=Math.max(currentSum,maxSum);
    }

    return maxSum;

}

    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int res=maxSubarr(arr);
        System.out.print(res);

    }
}