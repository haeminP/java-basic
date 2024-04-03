package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // Child variable referencing Child instance
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // Parent variable referencing Parent instance
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // Parent variable referencing Child instance
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // Member variable can't be overriden
        poly.method();  // Method overriding
    }
}
