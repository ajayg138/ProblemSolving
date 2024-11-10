import java.util.*;

public class StringReverse{
    // //FirstWay...
    // public static String reverse(String str){
    //     int last=str.length()-1;
    //     String rev="";
    //     for(int i=last;i>=0;i--){
    //         rev=rev+str.charAt(i);
    //     }

    //     return rev;
    // }


    public static String reverse(String str){
        int first=0;
        int last=str.length()-1;
        while(first<last){
            Char firstChar=charAt(first);
            charAt(first)=charAt(last);
            charAt(last)=firstChar;
            first++;
            last--;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println(reverse(str));
        
    }
}