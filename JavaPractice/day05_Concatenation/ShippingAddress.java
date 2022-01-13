package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Elvira Foster";
        int buildingNumber = 7;
        String streetName = " Park Rd", city = "Charlotte", state = "NC", zipCode = "28226",
                shppingAddress = name + "\n" + buildingNumber + streetName + "\n" + city + ", " + state + " " + zipCode;
        //System.out.println("My address is below:\n"+name+"\n"+buildingNumber+streetName+"\n"+city+", "+state+" "+zipCode);
        System.out.println(shppingAddress);
    }
}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
 */