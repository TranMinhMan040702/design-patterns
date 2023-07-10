package com.criscode.singleton;

public class ChocolateBoilerController {

    private static final long SLEEP_TIME = 2000;

    public static void main(String[] args) {
        ChocolateBoilerRunnable runnable1 = new ChocolateBoilerRunnable();
        Thread thread1 = new Thread(runnable1, "Thread 1");

        ChocolateBoilerRunnable runnable2 = new ChocolateBoilerRunnable();
        Thread thread2 = new Thread(runnable2, "Thread 2");

        thread1.start();
        thread2.start();
    }

    private static class ChocolateBoilerRunnable implements Runnable {

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " start");

            try {
                Thread.sleep(SLEEP_TIME);
                ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
                Thread.sleep(SLEEP_TIME);
                chocolateBoiler.fill();
                Thread.sleep(SLEEP_TIME);
                chocolateBoiler.boil();
                Thread.sleep(SLEEP_TIME);
                chocolateBoiler.drain();
                Thread.sleep(SLEEP_TIME);
                System.out.println(threadName + " used " + chocolateBoiler);
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
