import java.util.*;

public class DuplicatesBracket{

    public static boolean CheckDup(String str){
        
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==')'){
                if(st.peek() == '('){
                    return true;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }

            }else{
            st.push(ch);
            }
        }
        return false;
    }
    
   public static void main(String[] args){
    // String str="((a+b)+((c+d)))";
    String str="((a+b)+(c+d))";

    // Stack<Character> st=new Stack<>();

    // for(int i=0;i<str.length();i++){
    //     char ch=str.charAt(i);
    //     if(ch==')'){
    //         if(st.peek() == '('){
    //             System.out.print(true); //have duplicacy..
    //             return;
    //         }else{
    //             while(st.peek() != '('){
    //                 st.pop();
    //             }
    //             st.pop();
    //         }
    //     }else{
    //         st.push(ch);
    //     }
    // }
    // System.out.print(false);

    boolean res=CheckDup(str);
    System.out.println(res);


    }
}