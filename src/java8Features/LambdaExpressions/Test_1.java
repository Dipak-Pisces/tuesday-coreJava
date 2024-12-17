package java8Features.LambdaExpressions;

public class Test_1 {

    // Prior Functional Interface without Anonymour inner class

    interface AddSpecific {
        int add(int a, int b);
    }

    static void print(int result){
        System.out.println(result);
    }

    public static void main(String[] args) {

        class Addition implements AddSpecific{
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        }

        Addition addition = new Addition();
        print(addition.add(12,13));

    }
}
