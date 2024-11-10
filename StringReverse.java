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



//Second Way...
    // public static String reverse(String str){
    //     char[] charArray=str.toCharArray();
    //     int first=0;
    //     int last=str.length()-1;
    //     while(first<last){
    //         char firstChar=charArray[first];
    //         charArray[first]=charArray[last];
    //         charArray[last]=firstChar;
    //         first++;
    //         last--;
    //     }
    //     return new String(charArray);
    // }

    //third way...
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        String res=reverse(str);
        System.out.println(res);
        
    }
}