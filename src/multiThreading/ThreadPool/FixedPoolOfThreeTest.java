package multiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolOfThreeTest {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i=0; i<6; i++){
            service.execute( ()-> {
                System.out.println("This is "+Thread.currentThread().getName());
                try{Thread.sleep(1);}catch (InterruptedException e){throw new RuntimeException(e);}
            });
        }

        service.shutdown();
    }
}
