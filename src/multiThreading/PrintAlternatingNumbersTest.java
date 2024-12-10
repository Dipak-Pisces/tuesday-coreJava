package multiThreading;

import java.util.concurrent.SynchronousQueue;

public class PrintAlternatingNumbersTest {

    static class Printer {

        public boolean OddTurn = false;

        public synchronized void printOdd(int number) throws InterruptedException {
            while(!OddTurn){
                wait();
            }
            System.out.println(number +" "+Thread.currentThread().getName());
            OddTurn = false;
            notify();
        }

        public synchronized void printEven(int number) throws InterruptedException {
            while(OddTurn){
                wait();
            }
            System.out.println(number +" "+Thread.currentThread().getName());
            OddTurn = true;
            notify();
        }
    }

    public static void main(String[] args) {

        Printer p1 = new Printer();

        Thread t1 = new Thread(()->{
            for ( int i=1;i<=10;i+=2){
                try {
                    p1.printOdd(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            for ( int i=2; i<=10; i+=2){
                try {
                    p1.printEven(i);
                } catch (InterruptedException e){
                    throw  new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

    }
}
