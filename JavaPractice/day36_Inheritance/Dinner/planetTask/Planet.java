package day36_Inheritance.Dinner.planetTask;

public class Planet {

    public String name;
    public double mass, radius, surfaceGravity, surfaceArea, volume;
    public long population;

    public void setInfo(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, long population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public void moveAroundTheSun(){
        System.out.println(name + " is moving around the Sun");
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
