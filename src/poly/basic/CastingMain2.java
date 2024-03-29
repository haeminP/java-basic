package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        // poly.childMethod();     // Compile error

        // Downcasting (Parent type -> Child type)
        Child child = (Child) poly;  // x001 reference address
        child.childMethod();

        // Temporary Downcasting
        ((Child)poly).childMethod();


    }
}
