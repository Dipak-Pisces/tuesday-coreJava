package multiThreading.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(
                2,                      // Core pool size
                4,                      // Maximum pool size
                30L, TimeUnit.SECONDS,   // Keep-alive time
                new ArrayBlockingQueue<>(2), // Bounded queue
                new ThreadPoolExecutor.DiscardPolicy() // Rejection policy
        );

    }
}
