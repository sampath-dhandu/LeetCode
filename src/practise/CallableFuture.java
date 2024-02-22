package practise;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        Map<Integer, BigInteger> results = findAnswer(numbers);
        System.out.println(results);
    }

    public static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Map.Entry<Integer, BigInteger>>> futures = new ArrayList<>();
        for (Integer num : numbers) {
            futures.add(executorService.submit(new FactorialTak(num)));
        }
        Map<Integer, BigInteger> results = new HashMap<>();
        for (Future<Map.Entry<Integer, BigInteger>> f : futures) {
            try {
                Map.Entry<Integer, BigInteger> result = f.get();
                results.put(result.getKey(), result.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        return results;
    }
}

class FactorialTak implements Callable<Map.Entry<Integer, BigInteger>> {
    private final Integer number;

    public FactorialTak(Integer number) {
        this.number = number;
    }

    public Map.Entry<Integer, BigInteger> call() {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return new AbstractMap.SimpleEntry<>(number, fact);
    }
}
