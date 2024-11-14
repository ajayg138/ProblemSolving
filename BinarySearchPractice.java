public class BinarySearchPractice{

    public static int bSearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
            
        }

        return -1;
    }


    public static void main(String[] args){
        int[] arr={1,3,5,7,9,10,11,23,45};
        // int target=23;
        int target=24;

        int res=bSearch(arr,target);
        if(res != -1){
            System.out.println(target+" is found in array at index "+res);
        }else{
            System.out.println(target+" is not found in array...");
        }
    }
}