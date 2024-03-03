package oop1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Is square? " + rectangle.isSquare());

    }
}
