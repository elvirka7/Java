package day35_Encapsulation.dinner_tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (!(Character.isLetterOrDigit(ch)) && ch != ' ') {
                System.err.println("Name cannot contain special characters");
                System.exit(0);
            }
        }

        if(!(Character.isLetter(name.charAt(0)))){
            System.err.println("Name should start with letter");
            System.exit(0);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            System.err.println("Price cannot be a negative value");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.err.println("Quantity cannot be a negative value");
            System.exit(0);
        }
        if(name.equalsIgnoreCase("toilet paper") && quantity>1){
            System.err.println("Due to pandemic you can not buy more than one toilet paper at this Costco, please enter a different amount");
            System.exit(0);
        }
        this.quantity = quantity;
    }


    public double calcCost(){
        return unitPrice* quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}