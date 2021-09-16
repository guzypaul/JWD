package by.guzypaul.demothreads.ex03;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorThread min = new PriorThread("Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        norm.start();

        try {
            min.join();
            norm.join();
            max.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MainThread is stopped");
    }
}
