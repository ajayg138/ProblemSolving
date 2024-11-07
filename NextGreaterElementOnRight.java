import java.util.*;


public class NextGreaterElementOnRight{

    // //Brute force O(n^2)
//     public static void Next(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             boolean found=false;
//             for(int j=1+i;j<arr.length;j++){
//                 if(arr[j]>arr[i]){
//                     System.out.println(arr[i]+"-->"+arr[j]);
//                     found=true;
//                     break;
//                 }
//             }
//                 if(!found){
//                     System.out.println(arr[i]+"-->"+-1);
//                 }
//         }
//     }


//optimal O(n)...using Stack

public static int[] solve(int[] arr){
    int[] nge = new int[arr.length];

    Stack<Integer> st=new Stack<>();

    st.push(arr[arr.length-1]);
    nge[arr.length-1]=-1;

    for(int i=arr.length-2;i>=0;i--){
        while(st.size() > 0 && arr[i]>=st.peek()){
            st.pop();
        }

        if(st.size() == 0){
            nge[i]=-1;
        }else{
            nge[i]=st.peek();
        }
        st.push(arr[i]);
         
    }

    return age;
}


    public static void main(String[] args){
        int[] arr={2,5,9,3,1,12,6,8,7};
        // Next(arr);

    }
}