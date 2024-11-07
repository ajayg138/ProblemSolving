import java.util.*;

public class BalanceBracket{

    //Valid Parenthesis.......
    // public static boolean balanceBrac(String str){

    //     Stack<Character> st=new Stack<>();

    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);

    //         if(isOpening(ch)){
    //             st.push(ch);
    //         }else{
    //             if(st.isEmpty()){
    //                 return false;
    //             }else if(!isMatching(st.peek(),ch)){
    //                 return false;
    //             }else{
    //                 st.pop();
    //             }
    //         }
    //     }

    //     return st.isEmpty();
    // }

    // public static boolean isOpening(char ch){
    //     return ch=='(' || ch=='{' || ch=='[';
    // }

    // public static boolean isMatching(char a,char b){
    //     return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    // }



    //Balance Bracket....

    public static void main(String[] args){
        String str="[(a+b)+{(c+d)*(e/f)}]";
        boolean res=balanceBrac(str);
        System.out.print(res);

    }
}