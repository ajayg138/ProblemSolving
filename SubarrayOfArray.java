public class SubarrayOfArray{
    public static int[] SubArray(int[] arr,int target){
        int n=arr.length;

        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum += arr[end];
                if(sum==target){
                    return new int[]{start,end};
                }
            }
        }

        return new int[]{-1};


    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 7, 5};
        int target=12;
        int[] res=SubArray(arr,target);

        if(res.length==1){
            System.out.println("No Subarray with given sum found...");
        }else{
            System.out.println("Subarray with given sum found at: "+ res[0]+" and "+res[1]);
        }

    }
}