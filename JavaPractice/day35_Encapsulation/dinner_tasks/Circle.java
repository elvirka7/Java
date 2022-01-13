package day35_Encapsulation.dinner_tasks;

public class Circle {

    //private variable
    private double radius;
    public static double pi=3.14;


    public Circle(double radius) {
        setRadius(radius);
    }

    //getter
    public double getRadius() {
        return radius;
    }

    //setter
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid radius");
            System.exit(0);
        }
        this.radius = radius;
    }

    //methods
    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return radius * 2 * pi;
    }

    //toString
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", perimeter=" + calcPerimeter() +
                ", area=" + calcArea() +
                '}';
    }
}


/*
2. Create a class named Circle

            privtae variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the raidus of coircle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()
 */
