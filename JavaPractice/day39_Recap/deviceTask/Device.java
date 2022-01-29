package day39_Recap.deviceTask;

public class Device {
    private String name, brand, model;
    private double price;
    private boolean hasBattery;
    private static boolean hasPowerButton;


    static {
        hasPowerButton = true;
    }

    public Device(String name, String brand, String model, double price, boolean hasBattery) {
        setName(name);
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
    }

    public String getName() {
        return brand;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null) {
            System.err.println("Invalid name entry");
            System.exit(1);
        }
        this.name = name;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand.isBlank() || brand == null) {
            System.err.println("Invalid brand entry");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.isBlank() || model == null) {
            System.err.println("Invalid model entry");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price entry");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void turnOn() {
        System.out.println(name+" turns on");
    }

    public void turnOff() {
        System.out.println(name+" turns off");
    }


    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                ", hasPowerButton=" + hasPowerButton +
                ", hasBattery=" + hasBattery +
                '}';
    }
}

/*
Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()


	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

	3. Create a subclass of Device named Computer:

				Add the extra methods if needed

	4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

	5. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */