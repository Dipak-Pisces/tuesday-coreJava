package multiThreading;

public class HelloWorldUsingRunnableTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
        t1.start();

    }
}
