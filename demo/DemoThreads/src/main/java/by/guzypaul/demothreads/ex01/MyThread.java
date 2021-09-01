package by.guzypaul.demothreads.ex01;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

    }
}
