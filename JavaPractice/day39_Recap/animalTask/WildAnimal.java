package day39_Recap.animalTask;

public class WildAnimal extends Animal {

    private static boolean isWild;
    private static boolean isFriendly;
    private static boolean isPlayable;

    static {
        isWild = true;
        isFriendly = false;
        isPlayable = false;
    }

    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }


    public void hunt(){
        System.out.println(getName()+ " hunts other animals");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", isWild="+isWild+
        ", isFriendly="+isFriendly +
        ", isPlayalbe="+isPlayable;
    }
}
