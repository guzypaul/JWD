package by.guzypaul.demothreads.ex02;

public class Main {
    public static void main(String[] args) {
        RunnablePerson p1 = new RunnablePerson("ALice");
        Thread t1 = new Thread(p1);
        t1.start();
        RunnablePerson p2 = new RunnablePerson("Bob");
        Thread t2 = new Thread(p2);
        t2.start();

    }
}
