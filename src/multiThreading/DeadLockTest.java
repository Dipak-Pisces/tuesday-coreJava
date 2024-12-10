package multiThreading;

public class DeadLockTest {

   private static final Object r1 = new Object();
   private static final Object r2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            synchronized (r1){
                System.out.println( "T1 blocked R1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                synchronized (r2){
                    System.out.println("T1 blocked R2");
                }
            };
        });
        Thread t2 = new Thread(()->{
            synchronized (r2){
                System.out.println("T2 blocked R2");
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                synchronized (r1){
                    System.out.println("T2 blocked R2");
                }
            };
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("DEADLOCK RESOLVED");
    }
}
