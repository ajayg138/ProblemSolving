public class TwoSum{

    public static int[] twosum(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public class static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
        
        int[] result=twosum(arr,target);

        if(result != null){
            Systes
        }
    }
}