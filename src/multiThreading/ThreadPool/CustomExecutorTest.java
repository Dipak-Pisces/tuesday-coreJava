package multiThreading.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutorTest {

    public static void main(String[] args) {

        ExecutorService service = new ThreadPoolExecutor(
                2,
                6,
                60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        for ( int i=0 ;i<100; i++){
            service.execute(()->{
                System.out.println("This is " + Thread.currentThread().getName());
                //try{Thread.sleep(1000);}catch (InterruptedException e){throw new RuntimeException(e);}
            });
        }

        service.shutdown();
    }
}
