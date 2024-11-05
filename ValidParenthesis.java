import java.util.*;

public class ValidParenthesis{

    public static boolean isValid(String str){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            if(isOpeneing(cur)){
                st.push(cur);
            }else{
                if(st.isEmpty()){
                    return false;
                }else if(!isMatching(st.peek(),cur)){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }


    public static boolean isOpeneing(char ch){
        return ch=='(' || ch=='{' || ch=='[';
    }

    public static boolean isMatching(char a, char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }

    public static void main(String[] args){

        String str="()[{}";
        boolean res=isValid(str);
        if(res==false){
            System.out.print("false");
        }else{
            System.out.print("true");

        }

    }
}