public class BinarySearch{
    public static int Search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
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
        int[] arr={1,3,5,6,7,8,10,13,15,16};
        int target=20;
        int res=Search(arr,target);
        if(res != -1){
            System.out.print(target +" is present at index "+res);
        }else{
            System.out.print("Target Element is not present");
        }

    }
}