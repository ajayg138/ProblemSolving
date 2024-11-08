import java.util.*;
import java.lang.*;

public class ThreadMethods{


    public static void main(String[] args){

        System.out.println("Hello");
        
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ajay");
        System.out.println(Thread.currentThread().getName());
    }
}