import java.util.*;

public class CheckAnagram{

// Given two strings s and t, return true if t is an 
// anagram
//  of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false


    public static boolean validateAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char[] str1Array=str1.toCharArray();
        char[] str2Array=str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);


        String s1=new String(str1Array);
        String s2=new String(str2Array);

        if(s1.equals(s2)){
            return true;
        }        
    
    return false;

    }

    public static void main(String[] args){
        String str1="rat";
        String str2="car";

        boolean res=validateAnagram(str1,str2);
        if(res==true){
            System.out.println("Anagram...");
        }else{
            System.out.println("Not a Anagram...");
        }
    }
}