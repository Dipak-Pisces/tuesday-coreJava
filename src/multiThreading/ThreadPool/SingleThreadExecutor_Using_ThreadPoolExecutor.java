package multiThreading.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutor_Using_ThreadPoolExecutor {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1,
                1,
                0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(1),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        for (int i=0; i<10; i++ ){
            int taskid = i;
            executor.execute(()->{
                System.out.println(taskid+" "+ Thread.currentThread().getName());
                try{Thread.sleep(1000);}catch (InterruptedException e){throw new RuntimeException(e);}
            });
        }

        executor.shutdown();
    }
}
