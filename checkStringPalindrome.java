public class checkStringPalindrome{

    public static void checkPalindrome(String str){
        String ogStr = str;
        StringBuilder rev=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }

        if(ogStr.equals(rev.toString())){
            System.out.println("String is Palindrome...");
        }else{
            System.out.println("String is NOT Palindrome...");
        }
    }


    public static void main(String[] args){
        // String str="ajay";
        String str="madam";
        checkPalindrome(str);
    }
}