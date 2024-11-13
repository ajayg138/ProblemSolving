import java.util.*;

public class RemoveDuplicatesFromString{


// //Brute force Approach...O(n^2)
//     public static String RemoveDup(String str){

//         StringBuilder sb=new StringBuilder();
//         boolean[] seen=new boolean[256];

//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
            
//             if(!seen[c]){
//                 sb.append(c);
//                 seen[c]=true;   
//             }
//         }

//         return sb.toString();
//     }



//using HashSet...O(n)...
// public static String RemoveDup(String str){

//     HashSet<Character> hs=new HashSet<>();

//     StringBuilder sb=new StringBuilder();

//     for(int i=0;i<str.length();i++){
//         if(hs.add(str.charAt(i))){
//             sb.append(str.charAt(i));
//         }
//     }

//     return sb.toString();
// }


//using indexOf() method...O(n^2)

public static String RemoveDup(String str){
    String res="";
    // StringBuilder sb=new StringBuilder();

    for(int i=0;i<str.length();i++){
        if(res.indexOf(str.charAt(i)) == -1){
            res = res + str.charAt(i);
        }
    }

    return res;
}


    public static void main(String[] args){
        String str="aaaaxxbbccccc";

        String res=RemoveDup(str);
        System.out.println(res);
    }
}