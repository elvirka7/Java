package day31_Constructors.Dinner;

public class Carpet {
    public int width;
    public int length;
    public double unitPrice;
    public boolean isPersian;

    public void customOrder(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
      double totalPrice = (isPersian)? ((width*length)*unitPrice)+200 : (width*length)*unitPrice;

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=$" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=$" + calcCost() +
                '}';
    }
}
