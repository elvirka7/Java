package day33_Statics.muhtar_tasks;

public class Dog {
    public String breed, size, gender, color;
    public int age;
    public static int numberOfLegs = 4, numberOfEyes = 2, numberOfWings=0;
    public boolean isFriendly;

    public Dog(String breed, String size, String gender, String color, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    public void eat(){
        System.out.println(breed+" dog is eating");
    }
    public void sleep(){
        System.out.println(breed+" dog is sleeping");
    }
    public void play(){
        System.out.println(breed+" dog is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                ", number of legs=" + numberOfLegs +
                ", number of eyes=" + numberOfEyes +
                ", number of wings=" + numberOfWings +
                '}';
    }
}
/*

6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */