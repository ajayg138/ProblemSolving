import java.lang.*;

public class ThreadEx extends Thread{

    public void run(){
        System.out.print("Thread");
    }


    public static void main(String[] args){
        ThreadEx t=new ThreadEx();
        t.start();
        t.start();


    }
}