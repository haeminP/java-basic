package extends1.access.parent;

public class Parent {
    public int publicVal;
    protected  int protectedVal;
    int defaultVal;
    private  int privateVal;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("== Inside parent method ==");
        System.out.println("publicVal = " + publicVal);
        System.out.println("protectedVal = " + protectedVal);
        System.out.println("defaultVal = " + defaultVal);
        System.out.println("privateVal = " + privateVal);

        // Access available inside parent Method
        defaultMethod();
        privateMethod();
    }


}
