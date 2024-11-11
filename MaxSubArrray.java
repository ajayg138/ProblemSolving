public class MaxSubArrray{

    public static int maxSubarr(int[] arr){
        int maxSum=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int currentSum=0;

            for(int j=i;j<arr.length;j++){
                currentSum += arr[j];
                maxSum = Integer.max(maxSum,currentSum);
            }
        }

        return maxSum;
    }


    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int res=maxSubarr(arr);
        System.out.print(res);

    }
}