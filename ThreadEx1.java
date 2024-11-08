import java.lang.*;


public class ThreadEx1 extends Thread{
    public void run(){
        System.out.print("Single Thread");
    }

    public static void main(String[] args){
        ThreadEx1 t=new ThreadEx1();
        t.start();
    }
}