import java.util.*;

public class RemoveDuplicatesFromString{


//Brute force Approach...O(n)
    public static String RemoveDup(String str){

        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[256];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            
            if(!seen[c]){
                sb.append(c);
                seen[c]=true;   
            }
        }

        return sb.toString();
    }


    public static void main(String[] args){
        String str="aabbcc";

        String res=RemoveDup(str);
        System.out.println(res);
    }
}