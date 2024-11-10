import java.util.*;

public class StringReverse{

    public static String reverse(String str){
        int last=str.length()-1;
        String rev="";
        for(int i=last;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println(reverse(str));
        
    }
}