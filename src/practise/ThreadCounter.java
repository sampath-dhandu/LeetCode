package practise;

public class ThreadCounter extends Thread {

    private int threadNo;

    public ThreadCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countme();
    }

    private void countme() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value if i is: " + i + " and the thread number is: " + threadNo);
        }
    }

    public static void main(String[] args) {
        ThreadCounter threadCounter1 = new ThreadCounter(5);
        ThreadCounter threadCounter2 = new ThreadCounter(2);
        long startTime = System.currentTimeMillis();
        threadCounter1.run(); //Run should be called by JVM
        System.out.println("**************************");
        threadCounter2.start(); //so replace run by start
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required to process: " + (endTime -
                startTime));
    }
}
