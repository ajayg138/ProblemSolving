public class PalindromeString{

    public static void main(String[] args){

        String str="madam";
         String dup="madam";

        StringBuilder sb=new StringBuilder(str);

        sb.reverse();

        String res=sb.toString();

        if(dup.equals(res)){
            System.out.print("Palindrome...");
        }else{
            System.out.print("Not a Palindrome..");
        }
    }
}