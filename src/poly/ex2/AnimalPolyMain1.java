package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(Animal animal){
        System.out.println("Animal sound test starts");
        animal.sound();
        System.out.println("Animal sound test ends");
        System.out.println();
    }
}
