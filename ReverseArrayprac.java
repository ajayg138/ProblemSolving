public class ReverseArrayprac{


//using for loop..O(n);
    public static void reverse(int[] arr){
        int n=arr.length;
        int[] rev=new int[arr.length];

        for(int i=0;i<n;i++){
            rev[i]=arr[n-1-i];
        }

        for(int i:rev){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] arg){
        int[] arr={1,2,3,4,5};
        reverse(arr);

    } 
}