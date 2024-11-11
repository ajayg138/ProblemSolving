import java.util.*;

public class FindDuplicateInString{


//Brute Force Approach...
public static void findDuplicateCharacters(String str) {
    List<Character> countedChars = new ArrayList<>();

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int count=0;
    

    if(!countedChars.contains(ch)){
        for(int j=0;j<str.length();j++){
            if(str.charAt(j) == ch){
                count++;
            }
        }

        if(count>1){
            System.out.println("Character: "+ch+", count: "+count);
        }
        countedChars.add(ch);
    }
    }
}

    public static void main(String[] args){
        String str = "FindDuplicateInString";
        findDuplicateCharacters(str);
    }
}