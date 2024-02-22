package practise;

public class MyRunnable extends Thread {
    @Override
    public void run() {
        System.out.println("Hello multithread" + Thread.currentThread().getId());
    }
}
