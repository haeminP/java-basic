package static2;

public class Car {
    private String model;
    public static int count;

    public Car(String model){
        this.model = model;
        System.out.println("Purchased a car. Model: " + model);
        count++;
    }

    public static void showTotalCars() {
        System.out.println("Cars purchased: " + count);
    }

}
