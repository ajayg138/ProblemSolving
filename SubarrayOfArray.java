import java.util.*;

public class SubarrayOfArray{

    //brute force appraoch....
    // public static int[] SubArray(int[] arr,int target){
    //     int n=arr.length;

    //     for(int start=0;start<n;start++){
    //         int sum=0;
    //         for(int end=start;end<n;end++){
    //             sum += arr[end];
    //             if(sum==target){
    //                 return new int[]{start,end};
    //             }
    //         }
    //     }

    //     return new int[]{-1};


    // public static int[] SubArray(int[] arr,int target){
    //     int n=arr.length;

    //     for(int start=0;start<n;start++){
    //         int sum=0;
    //         for(int end=start;end<n;end++){
    //             sum += arr[end];
    //             if(sum==target){
    //                 return new int[]{start,end};
    //             }
    //         }
    //     }
    //     return new int[]{-1};
    // }

// public static int[] SubArray(int[] arr,int target){
//     int n=arr.length;
//     int sum=0;

//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             sum += arr[j];
//             if(sum==target){
//                 return new int[]{i,j};
//             }
//         }
//     }

//     return new int[]{-1};
// }


//Optimal Approach using HashMap

public static void SubArray(int[] arr,int target){
    int currSum=0;
    int start=0;
    int end=-1;

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<arr.length;i++){
        currSum += arr[i];

        if(currSum-target==0){
            start=0;
            end=i;
            break;
        }

        if(map.containsKey(currSum - target)){
            start=map.get(currSum - target)+1;
            end=i;
            break;
        }
        map.put(currSum,i);
    }

    if(end==-1){
        System.out.println("Not found...");
    }else{
        System.out.println(start+"..."+end);
    }


}
    
    public static void main(String[] args){
        int[] arr={1, 2, 3, 7, 5};
        int target=12;
        // int[] res=SubArray(arr,target);

        // if(res.length==1){
        //     System.out.println("No Subarray with given sum found...");
        // }else{
        //     System.out.println("Subarray with given sum found at: "+ res[0]+" and "+res[1]);
        // }

        SubArray(arr,target);

    }
}