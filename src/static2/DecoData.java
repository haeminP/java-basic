package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;      // Access to static variable

//        instanceValue++ // compile error - Access to instance variable
//        instanceMethod(); // compile error - Access to instance method
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;  // Access to static variable
        staticMethod(); // Access to static method
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
