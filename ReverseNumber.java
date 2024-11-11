import java.util.*;

public class ReverseNumber{
//firstWay
    // public static int reverse(int num){
    //     int rev=0;

    //     while(num != 0){
    //         int ld=num%10;
    //         rev=(rev*10)+ld;
    //         num=num/10;
    //     }

    //     return rev;
    // }

//secondway...

public static int reverse(int num){
    String str=Integer.toString(num);
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();

    return Integer.parseInt(sb.toString());
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();

        int res=reverse(num);
        System.out.println(res);
    }
}