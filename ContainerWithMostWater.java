import java.util.*;

public class ContainerWithMostWater{


//Brute Force Appraoch.................
    // public static int maxArea(int[] arr){
    //     int maxiArea=0;

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             int height=Math.min(arr[i],arr[j]);
    //             int width=j-i;
    //             int area=height * width;

    //             if(area>maxiArea){
    //                 maxiArea=area;
    //             }
    //         }
    //     }
    //     return maxiArea;


//Optimal Approach

public static int maxArea(int[] arr){
    int left=0;
    int right=arr.length-1;
    int max=0;


    while(left<right){
        int left_height=arr[left];
        int right_height=arr[right];

        int min_len=Math.min(left_height,right_height);
        int breadth=right-left;

        max = Math.max(max,min_len*breadth);

        if(left_height<right_height){
            left++;
        }else{
            right--;
        }
    }
    return max;
}


 public static void main(String[] args){
        // int[] arr={1,8,6,2,5,4,8,3,7};
        int arr[] ={1,1};
        int res=maxArea(arr);
        System.out.print("Maximum Water in array: "+res);

    }

}




   
