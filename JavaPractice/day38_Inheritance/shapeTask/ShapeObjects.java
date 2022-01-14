package day38_Inheritance.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Cirlce cirlce = new Cirlce("myCirlce", 5);
        Square square = new Square("hisSquare", 4);
        Rectangle rectangle = new Rectangle("ourRectangle", 8, 6);
        System.out.println(cirlce);
        System.out.println(square);
        System.out.println(rectangle);

    }
}
