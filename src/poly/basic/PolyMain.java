package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // Parent variable referencing parent instance
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // Child variable referencing child instance
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // Parent variable referencing child instance
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();


        // poly.childMethod(); // compile error
    }
}
