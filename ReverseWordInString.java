import java.util.*;


//Reverse Words...
public class ReverseWordInString{

    public static String reverseWords(String str){
        // String[] strArray=str.trim().split(" ");
        // String[] strArray=str.trim().split("\\s+");

        // StringBuilder sb=new StringBuilder();
        // for(int i=strArray.length-1;i>=0;i--){
        //     sb.append(strArray[i]);
        //     if(i!=0){
        //         sb.append(" ");
        //     }
        // }

        // return sb.toString();



        List<String> words=new ArrayList<>();
        String[] parts=str.split("\\.");

        for(String word : parts){
            if(!word.isEmpty()){
                words.add(word);
            }
        }

        Collections.reverse(words);

        return String.join(".",words);

    }


    public static void main(String[] args){
        String str=" Ajay   Ramchandra    Gole     ";
        String res=reverseWords(str);
        System.out.println(res);

    }
}