package practice_01_19_2022;

public class Fruit {

    Juice juice;

    public Fruit(String color) {
        juice = new Juice(color);

    }

}

 class Juice {
    String color;

    public Juice(String color){
        this.color = color;
    }

}
