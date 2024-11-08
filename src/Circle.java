public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return (radius * 2 * 3.14);
    }

    public double getArea() {
        return (radius * radius * 3.14);
    }
}
