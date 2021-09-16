package by.guzypaul.demothreads.ex09ProducerConsumer;

public class ProducerConsumerApp {
    public static void main(String[] args) {

        Store store = new Store();
        new Producer(store).start();
        new Consumer(store).start();
    }

}
