package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final local variable
        final int data1;
        data1 = 10;
        // can assign value only once
        // data1 = 20 // compile error

        // final local variable2
        final int data2 = 10;
    }

    static void method(final int parameter){
        // paramter = 20        // compile error
    }
}
