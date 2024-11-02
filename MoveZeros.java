public class MoveZeros{

    public static void Move(int[] arr){
        int n=arr.length;

        int left=0;

        for(int right=0;right<n;right++){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

        
        System.out.println("All Zeros at end: "+arr);

    }

    public static void main(String[] args){
        int[] arr={0,1,0,3,12};
        Move(arr);


    }
}