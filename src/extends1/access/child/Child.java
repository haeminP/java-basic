package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicVal = 1;
        protectedVal = 1; // Access allowed: inheritance or same package
//        defaultVal = 1; // Compile error: different packages
//        privateVal = 1; // Compile error: Access denied

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
