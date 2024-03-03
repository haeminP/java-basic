package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // call public
        data.publicField = 1;
        data.publicMethod();

        // call default: not allowed
//        data.defaultField = 2;
//        data.defaultMethod();

        // call private: not allowed
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
