package by.guzypaul.demothreads.ex01;

public class HelloWorldThread extends Thread {
    HelloWorldThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Hello world!");
    }

    @Override
    public synchronized void start() {
        super.start();
    }
}
