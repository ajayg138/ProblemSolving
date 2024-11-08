import java.util.*;


public class ReverseInteger{

    public static int reverse(int n){
        int rev=0;

        while(n != 0){
            int ld=n%10;

            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev=(rev*10)+ld;
            n=n/10;
        }

        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();


        int res=reverse(n);
        System.out.print("Reverse of "+n+" is "+res);

    }
}