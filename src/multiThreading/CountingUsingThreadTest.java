package multiThreading;

public class CountingUsingThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Test();
        t1.start();
    }

    static class Test extends  Thread{
        @Override
        public void run(){
            for (int i=0;i<10;i++){
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
    }
}
