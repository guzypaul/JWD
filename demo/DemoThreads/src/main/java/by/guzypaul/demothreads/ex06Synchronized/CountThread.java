package by.guzypaul.demothreads.ex06Synchronized;

class CountThread implements Runnable {

    CommonResource res;

    CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        res.increment();
    }
}
