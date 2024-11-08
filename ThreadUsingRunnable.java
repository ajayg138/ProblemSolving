import java.lang.*;

public class ThreadUsingRunnable implements Runnable{

    public void run(){
        System.out.print("Runnable Interface");
    }

    public static void main(String[] args){

        ThreadUsingRunnable t=new ThreadUsingRunnable();
        Thread td=new Thread(t); 
        td.start();
    }
}