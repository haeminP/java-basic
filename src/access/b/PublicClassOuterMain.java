package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // Default class in another package cannot be imported/used
//        PublicClass.DefaultClass1 class1 = new DefaultClass1();
    }
}
