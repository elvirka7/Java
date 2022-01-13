package day36_Inheritance.Dinner.sportTask;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Sport {

    public String name;
    public int numberOfPLayers, numberOfReferee, rules;

    public void setInfo(String name, int numberOfPLayers, int numberOfReferee, int rules) {
        this.name = name;
        this.numberOfPLayers = numberOfPLayers;
        this.numberOfReferee = numberOfReferee;
        this.rules = rules;
    }

    public void play(){
        System.out.println("Aizada is playing "+name +" with "+numberOfPLayers + " players");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPLayers=" + numberOfPLayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules=" + rules +
                '}';
    }
}
