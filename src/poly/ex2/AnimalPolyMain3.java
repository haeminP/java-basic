package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    public static void soundAnimal(Animal animal){
        System.out.println("Animal sound test starts");
        animal.sound();
        System.out.println("Animal sound test ends");
        System.out.println();
    }
}
