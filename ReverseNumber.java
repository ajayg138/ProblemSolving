import java.util.*;

public class ReverseNumber{

    public static int reverse(int num){
        int rev=0;

        while(num != 0){
            int ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }

        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();

        int res=reverse(num);
        System.out.println(res);
    }
}