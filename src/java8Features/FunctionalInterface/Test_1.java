package java8Features.FunctionalInterface;

public class Test_1 {

    interface Test{
        //anstract method
        int add(int a, int b);

        default int defaultShow(int a, int b){
            return a+b;
        }

        static int staticShow(int a, int b){
            return a+b;
        }
    }

    public static void main(String[] args) {

    }
}
