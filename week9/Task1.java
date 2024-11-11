package week9;

public class Task1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.getArea());

        circle2.radius=100;
        System.out.println("The area of the circle of radius " + circle2.getArea());
    }
}