import java.util.*;

public class ContainerWithMostWater{


//Brute Force Appraoch.................
    public static int maxArea(int[] arr){
        int maxiArea=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                int area=height * width;

                if(area>maxiArea){
                    maxiArea=area;
                }
            }
        }
        return maxiArea;
    }

    public static void main(String[] args){
        int[] arr={1,8,6,2,5,4,8,3,7};

        int res=maxArea(arr);
        System.out.print("Maximum Water in array: "+res);

    }
}