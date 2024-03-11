package _09_Polymorphism._02_Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * this.radius);
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * Math.pow(this.radius, 2));
    }
}
