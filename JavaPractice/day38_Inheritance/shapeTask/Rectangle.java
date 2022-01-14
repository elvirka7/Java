package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public double width, length;


    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString()+", width= "+width+", length="+length;
    }
}
