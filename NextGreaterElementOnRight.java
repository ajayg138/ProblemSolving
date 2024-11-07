import java.util.*;

//Brute force O(n^2)
public class NextGreaterElementOnRight{
    public static void Next(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=1+i;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    System.out.println(arr[i]+"-->"+arr[j]);
                    found=true;
                    break;
                }
            }
                if(!found){
                    System.out.println(arr[i]+"-->"+-1);
                }
        }
    }


    public static void main(String[] args){
        int[] arr={2,5,9,3,1,12,6,8,7};
        Next(arr);

    }
}