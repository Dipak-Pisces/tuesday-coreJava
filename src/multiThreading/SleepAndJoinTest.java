package multiThreading;

public class SleepAndJoinTest {

    static class T1 extends  Thread{
        @Override
        public void run(){

            for (int i=0;i<10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new T1();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
