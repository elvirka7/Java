package Day_06_01_22_2022.question7;

public class Pond {

    static Water water;

   public void setWater(String color) {
        water = new Water(color);
    }

    public Pond(String color) {
        water = new Water(color);
    }

}
