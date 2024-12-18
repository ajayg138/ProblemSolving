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


    //Second Way...
    // public static boolean checkPalindrome(String str){
    //     int first=0;
    //     int last=str.length()-1;

    //     while(first<last){
    //         if(str.charAt(first)!=str.charAt(last)){
    //             return false;
    //         }
    //         first++;
    //         last--;
    //     }

    //     return true;
    // }

    //Third Way
    public static void checkPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            System.out.print("Palindrome..");
        }else{
            System.out.print("Not Palindrome..");
        }
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        // boolean res=checkPalindrome(str);
        // if(res==true){
        //     System.out.println("Palindrome...");
        // }else{
        //     System.out.println("Not a Palindrome...");
        // }

            checkPalindrome(str);
    }
}