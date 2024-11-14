import java.util.*;

public class PrintDupCharInString{

    public static void printDupChar(String str){
        char[] strArray=str.toCharArray();
        Arrays.sort(strArray);

        String sortedStr=new String(strArray);

        for(int i=0;i<str.length();i++){
            int count=1;

            while(i<str.length()-1 && sortedStr.charAt(i) == sortedStr.charAt(i+1)){
                count++;
                i++;
            }

            if(count>1){
                System.out.println(sortedStr.charAt(i) + ": count="+count);
            }
        }


    }


    public static void main(String[] args){
        String str="geeksforgeeks";

        printDupChar(str);
    }
}