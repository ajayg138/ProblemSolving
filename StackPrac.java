import java.util.*;

public class StackPrac{


    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);


        System.out.println(st+"-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"-->"+st.peek()+" "+st.size());
        st.pop();
    }
}