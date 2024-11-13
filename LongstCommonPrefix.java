import java.util.*;

public class LongstCommonPrefix{
    public static String LongestPrefix(String[] str){
        if(str==null || str.length==0){
            return "-1";
        }


        Arrays.sort(str);

        String first=str[0];
        String last=str[str.length-1];

        int minLength=Math.min(first.length(),last.length());

        int i=0;
        while(i<minLength){
            if(first.charAt(i)==last.charAt(i)){
                i++;
            }else{
                break;
            }
        }

        return first.substring(0,i);
    }



    public static void main(String[] args){
        String[] arr={"apple","ape","april"};
        // String[] arr={"geeqksforgeeks", "geeqks", "geeqk",
        //                   "geeqzer" };

        String res=LongestPrefix(arr);
        System.out.print(res);

    }
}