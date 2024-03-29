package extends1.overriding;

public class ElectricCar extends Car {


    @Override
    public void move() {
        System.out.println("Electric car starts moving FAST");
    }
    public void charge() {
        System.out.println("Charging the car");
    }
}
