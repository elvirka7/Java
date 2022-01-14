package day38_Inheritance.shapeTask;

public class Cirlce extends Shape{

    public double radius;
    public  static double pi = 3.14;


    public Cirlce(String name, double radius) {
        super(name);
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pi=" + pi + ", " +
                "radius=" + radius;

    }
}
