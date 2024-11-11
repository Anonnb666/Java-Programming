package week9;

public class Circle {

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

    double radius;

    Circle(){
        radius = 1;
    }

    Circle(double r){
        radius = r;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    void setRadius (double r){
        radius = r;
    }
}
