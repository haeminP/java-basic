package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr){
            System.out.println("Animal sound test starts");
            animal.sound();
            System.out.println("Animal sound test ends");
            System.out.println();
        }

    }
}
