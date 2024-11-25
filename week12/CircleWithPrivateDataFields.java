package week12;

public class CircleWithPrivateDataFields {
    private double radius = 1;

    private static int numberOfObjects = 0;

    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    public CircleWithPrivateDataFields(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        radius = (radius > 0) ? radius : 0;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
