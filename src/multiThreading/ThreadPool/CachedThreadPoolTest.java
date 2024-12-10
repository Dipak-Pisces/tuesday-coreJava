package multiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();

        for ( int i=0; i<4; i++){
            service.execute(()->{
                System.out.println("This is "+Thread.currentThread().getName());
                try{Thread.sleep(1000);}catch (InterruptedException e){throw new RuntimeException(e);}
            });
        }

        service.shutdown();

    }
}
