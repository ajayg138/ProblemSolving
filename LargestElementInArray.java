public class LargestElementInArray{


    public static void largest(int[] arr){
        int n=arr.length;
        int max=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.print("Maximum Element in an Array is: "+max);
    }

    public static void main(String[] args){

        int[] arr={1,2,3,4,3,2,3,4,5,6,6778};
        largest(arr);
        
    }
}