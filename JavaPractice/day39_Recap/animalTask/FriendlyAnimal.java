package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal{

    private boolean isWild;
    private static boolean isFriendly;
    private static boolean isPlayable;

    static {
        isFriendly = true;
        isPlayable = true;
    }

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age, boolean isWild) {
        super(name, breed, size, color, gender, age);
        setWild(isWild);
    }


    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
                isWild = wild;
    }



    //methods
    public void play(){
        System.out.println(getName() + " likes to play");
    }

    public void pet(){
        System.out.println(getName() + " is a pet");
    }


    @Override
    public String toString() {

        return super.toString() +
                ", isWild=" + isWild+
        ", isFriendly=" + isFriendly +
                ", isPlayalbe=" + isPlayable;
    }



}

