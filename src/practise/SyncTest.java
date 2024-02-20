package practise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 1000; i++) {

            executor.submit(() -> {
                test(1);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
        }

    }


    public static int test(int number){

        System.out.print(number);

        return number;
    }

}
