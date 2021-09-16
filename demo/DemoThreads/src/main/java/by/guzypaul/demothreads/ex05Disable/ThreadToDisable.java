package by.guzypaul.demothreads.ex05Disable;

public class ThreadToDisable implements Runnable {
    private boolean isActive;

    void disable() {
        isActive = false;
    }

    ThreadToDisable() {
        isActive = true;
    }

    @Override
    public void run() {

        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        int counter = 1; // счетчик циклов
        while (isActive) {
            System.out.println("Цикл " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
