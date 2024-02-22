package practise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        Runnable task= () -> System.out.println("Hello from Executor on thread" +Thread.currentThread().getId());

        for(int i =0 ;i < 10 ;i ++){
            executorService.execute(task);
        }

        executorService.shutdown();
    }

}
