import java.util.*;


public class TwoSum{


//Brute Force Appraoch
    // public static int[] twosum(int[] arr,int target){

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==target){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }
    //     return null;
    // }

    public static int[] twosum(int[] arr,int target){
        HashMap<Integer, Integer> hm=new HashMap<>();

        int n=arr.length;
        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        }

        for(int i=0;i<n;i++){
            int complement=target-arr[i];
            if(hm.containsKey(complement) && hm.get(complement) != i){
                return new int[] {hm.get(complement),i};
            }
        }

        return null;
    }

    public static void main(String[] args){
        // int[] arr={2,7,11,15};
        int[] arr={3,2,4};
        int target=6;
        
        int[] result=twosum(arr,target);

        if(result != null){
            System.out.print("[" +result[0] +", "+ result[1]+"]");
        }else{
            System.out.print("null");
        }
    }
}