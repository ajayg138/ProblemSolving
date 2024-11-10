import java.lang.*;

//Single task from single thread
public class ThreadEx1 extends Thread{
    public void run(){
        System.out.println("Single Thread");
    }
    

    public static void main(String[] args){
        ThreadEx1 t=new ThreadEx1();
        t.start();
        ThreadEx1 t1=new ThreadEx1(); //single task by multiple thread
        t1.start();

    }
}