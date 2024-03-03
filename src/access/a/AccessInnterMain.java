package access.a;

import oop1.Account;

public class AccessInnterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // call public
        data.publicField = 1;
        data.publicMethod();

        // call default
        data.defaultField = 2;
        data.defaultMethod();

        // call private
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
