import java.util.*;

public class ContainsDuplicate{


// //Brute Foce Approach...
//     public static boolean checkDup(int[] arr){
//         Arrays.sort(arr);
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]==arr[i-1]){
//                 return true;
//             }
//         }

//         return false;
//     }

public static boolean checkDup(int[] arr){
    HashSet<Integer> hm=new HashSet<>();

    for(int num:arr){
        if(hm.contains(num)){
            return true;
        }
        hm.add(num);
    }

    return false;
}


    public static void main(String[] args){
        int[] arr={1,2,3,4};
        
        System.out.print(checkDup(arr));
    }
}