package day35_Encapsulation.dinner_tasks;

public class Carpet {

    private double width, length;
    private double unitPrice;
    private boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Invalid width");
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.err.println("Invalid length");
            System.exit(0);
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid unit price");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }


    //calcCost()
    public double calCost() {
        double totalPrice = (width * length) * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + calCost() +
                '}';
    }
}