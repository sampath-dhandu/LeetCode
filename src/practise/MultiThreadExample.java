package practise;

public class MultiThreadExample {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        MyRunnable myRunnable= new MyRunnable();
        Thread thread=new Thread(myRunnable);
        Thread thread1=new Thread(myRunnable);
        thread.start();
        thread1.start();
    }
}
