package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // Upcasting can be omitted, and omission is recommended
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }

}
