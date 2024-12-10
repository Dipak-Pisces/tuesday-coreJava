package multiThreading;

public class SharedResource {

    /* Synchronized is magical */

    static class Counter {
        int counter =0 ;

        public synchronized void increment(){
            counter ++;
            System.out.println(Thread.currentThread().getName()+" _INCREMENT_ "+counter);
        }
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();

        Runnable r1 = ()->{
            for ( int i=0; i<5; i++){
                c1.increment();
            }
        };

        Thread t1 = new Thread( r1, "Thread 1");
        Thread t2 = new Thread( r1, "Thread 2");
        t1.start();
        t2.start();
    }
}
