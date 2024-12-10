package multiThreading;

public class MultipleThreadTest {

      static class T1 extends Thread{
        @Override
        public void run(){
            for ( int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    static class T2 extends Thread{
          @Override
        public void run(){
              for (int i=0;i<10; i++){
                  System.out.println(Thread.currentThread().getName());
              }
          }
    }

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();

        t1.start();
        t2.start();
    }
}
