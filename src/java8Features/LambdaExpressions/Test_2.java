package java8Features.LambdaExpressions;

public class Test_2 {

    // Prior Functional Interface wiht Anonymour inner class

    interface AddSpecific {
        int add(int a, int b);
    }

    static void print(int result){
        System.out.println(result);
    }

    public static void main(String[] args) {

        AddSpecific addSpecific = new AddSpecific() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        print(addSpecific.add(15,16));
    }
}
