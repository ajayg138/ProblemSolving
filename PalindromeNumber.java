import java.util.*;


public class PalindromeNumber{

    public static boolean checkPalindrom(int n){
        //edge cases
        if(n<0 || (n%10==0 && n!=0)){
            return false;
        }

        int rev=0;
        int og=n;

        while(n!=0){
            int ld=n%10;
            //Checking overflow condition...
            if(rev > Integer.MAX_VALUE/10){
                return false;
            }
            rev=(rev*10)+ld;
            n=n/10;
        }

        return rev==og;
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();


    }
}