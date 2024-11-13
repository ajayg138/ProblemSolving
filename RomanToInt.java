import java.util.*;
public class RomanToInt{

//Brute Force Approach....O(n)

    // public static int values(char r){
    //     if(r=='I')
    //         return 1;
    //     if(r=='V')
    //         return 5;
    //     if(r=='X')
    //         return 10;
    //     if(r=='L')
    //         return 50;
    //     if(r=='C')
    //         return 100;
    //     if(r=='D')
    //         return 500;
    //     if(r=='M')
    //         return 1000;
    //     return -1;
    // }


    // public static int romanTodecimal(String str){
    //     int res=0;
    //     for(int i=0;i<str.length();i++){
    //         int s1=values(str.charAt(i));

    //         if(i+1<str.length()){
    //             int s2=values(str.charAt(i+1));
    //             if(s1>=s2){
    //                 res += s1;
    //             }else{
    //                 res += (s2-s1);
    //                 i++;
    //             }
    //         }else{
    //             res += s1;
    //         }
    //     }
    //     return res;
    // }


    // public static void main(String[] args){
    //     String str="MCMIV";
    //     System.out.println(romanTodecimal(str));
    // }


    // public static int value(char ch){
    //     if(ch=='I')
    //         return 1;
    //     if(ch=='V')
    //         return 5;
    //     if(ch=='X')
    //         return 10;
    //     if(ch=='L')
    //         return 50;
    //     if(ch=='C')
    //         return 100;
    //     if(ch=='D')
    //         return 500;
    //     if(ch=='M')
    //         return 1000;
    //     return -1;
    // }


    // public static int convertRomanToDecimal(String str){
    //     int res=0;
    //     for(int i=0;i<str.length();i++){
    //         int s1=value(str.charAt(i));
    //         if(i+1<str.length()){
    //             int s2=value(str.charAt(i+1));
    //             if(s1>=s2){
    //                 res += s1;
    //             }else{
    //                 res += (s2-s1);
    //                 i++;
    //             }
    //         }else{
    //             res += s1;
    //         }
    //     }

    //     return res;
    // }

    // public static void main(String[] args){
    //     String str="MCMIV";
    //     System.out.println(convertRomanToDecimal(str));
    // }


    //Using HashMap

    public static int convertRomanToDecimal(String str){
        HashMap<Character, Integer> hm=new HashMap<>();

        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int res=0;

        for(int i=0;i<str.length();i++){
            if(i+1<str.length() && hm.get(str.charAt(i)) < hm.get(str.charAt(i+1))){
                res += (hm.get(str.charAt(i+1)) - hm.get(str.charAt(i)));
                i++;
            }else{
                res += hm.get(str.charAt(i));
                
            }
        }
    return res;
    }

public static void main(String[] args){
        String str="MCMIV";
        System.out.println(convertRomanToDecimal(str));
    }


    

}