import java.util.*;

public class StringPalindrome{

    // public static boolean checkPalindrome(String str){
    //     //First way
    //     int last=str.length()-1;
    //     String rev="";
    //     String dup=str;
    //     for(int i=last;i>=0;i--){
    //         rev=rev+str.charAt(i);
    //     }
    //     return rev.equals(dup);
    // }

    public static boolean checkPalindrome(String str){
        int first=0;
    }





    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        boolean res=checkPalindrome(str);
        if(res==true){
            System.out.println("Palindrome...");
        }else{
            System.out.println("Not a Palindrome...");
        }


    }
}