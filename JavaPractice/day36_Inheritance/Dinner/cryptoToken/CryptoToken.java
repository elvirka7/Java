package day36_Inheritance.Dinner.cryptoToken;

public class CryptoToken {
    public double price, marketCap, volume, circulatingSupply;
    public int quantity;
    public boolean isMineable;

    public void setInfo(double price, int quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice() {
        return price * quantity;
    }


    public String toString() {
        return "CryptoToken{" +
                "price=$" + price +
                ", quantity=" + quantity +
                ", marketCap=$" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", total price =" + totalPrice() +
                '}';
    }
}