public class MinNMaxEleInArray{

    //First BRute Force...
    public static void MinMax(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }


    public static void main(String[] args){
        int[] arr={3, 5, 4, 1, 9};
        MinMax(arr);
    }
}