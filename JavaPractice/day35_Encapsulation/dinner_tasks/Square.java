package day35_Encapsulation.dinner_tasks;

public class Square {
    private double side;

    //Constructor
    public Square(double side) {
      setSide(side);
    }

    //Encapsulation
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if(side<0){
            System.err.println("Invalid side");
            return;
        }
        this.side = side;
    }

    //Methods
    public double calcArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return side*4;
    }

    //toString method
    public String toString() {
        return "Square{" +
                " side:" + side +
                " area:" + calcArea() +
                " perimeter:" + calcPerimeter() +
                '}';


    }

}
/*
1. Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement

 */




