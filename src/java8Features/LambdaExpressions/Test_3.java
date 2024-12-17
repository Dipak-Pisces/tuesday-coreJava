package java8Features.LambdaExpressions;

public class Test_3 {

    // with lambda
    interface AddSpecific {
        int add(int a, int b);
    }

    static void print(int result){
        System.out.println(result);
    }

    public static void main(String[] args) {
        int A = 12;
        int B = 13;
        AddSpecific addSpecific = (a, b) -> a+b;
        int result = addSpecific.add(A,B);
        print(result);
    }
}
