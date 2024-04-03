package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Calling parent1");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Calling parent2");
        call(parent2);

    }

    public static void call(Parent parent){
        parent.parentMethod();

        // If Child instance, execute childMethod()
        if (parent instanceof Child){
            System.out.println("It is a Child instance");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
