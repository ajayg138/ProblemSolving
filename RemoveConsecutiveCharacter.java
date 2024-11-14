import java.util.*;

public class RemoveConsecutiveCharacter{

//Remove Duplicate From String...
    // public static String remove(String str){
    //     HashSet<Character> hs=new HashSet<>();

    //     StringBuilder sb=new StringBuilder();

    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if(hs.add(ch)){
    //             sb.append(ch);
    //         }
    //     }

    //     return sb.toString();
    // }

//Brute Force Approach...O(N)...
// public static String remove(String str){
//     String res="";

//     for(int i=0;i<str.length();i++){
//         if(i==0 || str.charAt(i) != str.charAt(i-1)){
//             res = res +str.charAt(i);
//         }
//     }

//     return res;
// }


// public static String remove(String str){
//     StringBuilder sb=new StringBuilder();

//     for(int i=0;i<str.length();i++){
//         if(i==0 || str.charAt(i) != str.charAt(i-1)){
//             sb.append(str.charAt(i));
//         }
//     }

//     return sb.toString();
// }

//Optimal Approah using StringBuilder...

public static String remove(String str){
    StringBuilder sb=new StringBuilder();

    for(int i=0;i<str.length();i++){
        if(i==0 || str.charAt(i) != str.charAt(i-1)){
            sb.append(str.charAt(i));
        }
    }

    return sb.toString();
}

    public static void main(String[] args){
        String str="aabaa";
        // String str="aabb";
        System.out.println(remove(str));
    }
}