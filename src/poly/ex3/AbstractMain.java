package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
        // An abstract class cannot be created
//        AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        AbstractAnimal[] animalArr = {dog, cat, cow};

        for (AbstractAnimal animal : animalArr){
            System.out.println("Animal sound test starts");
            animal.sound();
            System.out.println("Animal sound test ends");
            System.out.println();
        }

    }
}
