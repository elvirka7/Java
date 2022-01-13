package day35_Encapsulation.dinner_tasks;

public class Dog {
    public String breed, size, color, name;
    public char gender;
    public int age;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public boolean isFriendly;

    public Dog(String breed, String size, String color, String name, char gender, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    static{
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", numberOfLegs = "+numberOfLegs+
                ", numberOfEyes = "+numberOfEyes+
                ", numberOfWings = "+numberOfWings+
                ", isFriendly=" + isFriendly +
                '}';
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void play(){
        System.out.println(name+ " is playing");
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }


}
