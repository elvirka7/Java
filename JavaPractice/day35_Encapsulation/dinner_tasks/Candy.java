package day35_Encapsulation.dinner_tasks;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0){
            System.err.println("Invalid quantity");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("Invalid price");
           System.exit(0);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        String totalPrice=(price==0)?"Free":String.valueOf(price);

        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + totalPrice +
                ", hasPeanuts=" + hasPeanuts +
                '}';




    }
}