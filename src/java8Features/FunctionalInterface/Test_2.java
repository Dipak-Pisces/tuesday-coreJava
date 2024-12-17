package java8Features.FunctionalInterface;

public class Test_2 {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.print();
    }
}
//
interface Parent {
    default void print(){
        System.out.println("Hello from parent");
    }
}

class Child implements Parent{

    public void print(){
        System.out.println("Hello from child");
    }
    // This is method hiding
    // The static method which is called is determined by reference type. if its Parent interface or Child class
}

/*
    The print() method in the Parent interface has public visibility (because methods in interfaces are implicitly public).

    The print() method in the Child class is not public, which violates the rule in Java that says the overriding method
    should not have weaker access privileges than the method it overrides.
 */
