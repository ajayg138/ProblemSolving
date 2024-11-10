public class BalanceString{

    public static boolean isBalanced(String num){
        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<num.length();i++){
            int digit=Character.getNumericValue(num.charAt(i));

            if(i%2==0){
                evenSum += digit;
            }else{
                oddSum += digit;
            }
        }

        return evenSum==oddSum;
    }

    public static void main(String[] args){
        String num="24123";

        boolean res=isBalanced(str);
        if(res==true){
            System.out.print("Balance String...");
        }else{
            System.out.print("Not a Balance String...");
        }

    }
}

/*Input: num = "1234"

Output: false

Explanation:

The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
Since 4 is not equal to 6, num is not balanced.
Example 2:

Input: num = "24123"

Output: true

Explanation:

The sum of digits at even indices is 2 + 1 + 3 == 6, and the sum of digits at odd indices is 4 + 2 == 6.
Since both are equal the num is balanced.*/