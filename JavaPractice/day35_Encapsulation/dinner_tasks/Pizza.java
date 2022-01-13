package day35_Encapsulation.dinner_tasks;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equals("large") || size.equals("medium") || size.equals("small"))) {
            System.err.println("Please enter a valid pizza size");
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid topping number");
            System.exit(0);
        }
        if ((size.equals("small") && numberOfCheeseTopping > 3) || (size.equals("medium") && numberOfCheeseTopping > 4) || (size.equals("large") && numberOfCheeseTopping > 5)) {
            System.err.println("You have reached maximum allowed number of toppings");
            System.exit(0);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

 public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
    if (numberOfPepperoniTopping < 0) {
        System.err.println("Invalid topping number");
        System.exit(0);
    }
    if ((size.equals("small") && numberOfPepperoniTopping > 4) || (size.equals("medium") && numberOfPepperoniTopping > 5) || (size.equals("large") && numberOfPepperoniTopping > 6)) {
        System.err.println("You have reached maximum allowed number of toppings");
        System.exit(0);
    }
    this.numberOfPepperoniTopping = numberOfPepperoniTopping;
}

    public double calcCost(){

        double cost = (size.equals("small"))? 10 :(size.equals("medium"))? 12 : 14;
        double totalCost = cost+(numberOfPepperoniTopping+numberOfCheeseTopping)*2;
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", number Of Cheese Topping=" + numberOfCheeseTopping +
                ", number Of Pepperoni Topping=" + numberOfPepperoniTopping +
                ", total cost=$" + calcCost() +
                '}';
    }
}

