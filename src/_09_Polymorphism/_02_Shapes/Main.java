package _09_Polymorphism._02_Shapes;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle((double) 20, (double) 25);
        rectangle.calculateArea();
        System.out.println(rectangle.getArea());
    }
}
