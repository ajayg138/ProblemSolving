import java.util.*;

public class ArraySort{

    public static void sorting(int[] arr){
        Arrays.sort(arr);

        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args){
        int[] arr={-4,-6,-8,-9,2,4,5,204,0};
        sorting(arr);

    }
}