import java.util.*;
import java.lang.*;

public class ThreadMethods extends Thread{

    public void run(){
        System.out.println("Thread Task: "+Thread.currentThread().getName());
    }


    public static void main(String[] args){

        System.out.println("Hello: "+Thread.currentThread().getName());

        ThreadMethods t=new ThreadMethods();
        t.start();
        
        ThreadMethods t1=new ThreadMethods();
        t1.start();




        // System.out.println("Hello");
        
        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().setName("Ajay");
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(10/0);

    }
}