import java.util.*;

public class PrintDupCharInString{


//Brute Force Appraoch...
    // public static void printDupChar(String str){
    //     char[] strArray=str.toCharArray();
    //     Arrays.sort(strArray);

    //     String sortedStr=new String(strArray);

    //     for(int i=0;i<str.length();i++){
    //         int count=1;

    //         while(i<str.length()-1 && sortedStr.charAt(i) == sortedStr.charAt(i+1)){
    //             count++;
    //             i++;
    //         }

    //         if(count>1){
    //             System.out.println(sortedStr.charAt(i) + ": count="+count);
    //         }
    //     }


    // }


    // public static void printDupChar(String str){

    //     int len=str.length();
    //     char[] strArray=str.toCharArray();

    //     Arrays.sort(strArray);

    //     String SortedStr=new String(strArray);

    //     for(int i=0;i<len;i++){
    //         int count=1;

    //         while(i<len-1 && SortedStr.charAt(i)==SortedStr.charAt(i+1)){
    //             count++;
    //             i++;
    //         }

    //         if(count>1){
    //             System.out.println(SortedStr.charAt(i)+": count="+count);
    //         }
    //     }
    // }



//Optimal Solution using HashMap..O(N)

    public static void printDupChar(String str){
        HashMap<Character, Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            }else{
                hm.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> mapElement : hm.entrySet()){
            if(mapElement.getValue()>1){
                System.out.println(mapElement.getKey()+": count = "+mapElement.getValue());

            }
        }
    }


    public static void main(String[] args){
        // String str="geeksforgeeks";
        String str="test string";

        printDupChar(str);
    }
}