package day36_Inheritance.Dinner.employeeTask1.sportTask;

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
        return "CobinGroup.Sport{" +
                "name='" + name + '\'' +
                ", numberOfPLayers=" + numberOfPLayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules=" + rules +
                '}';
    }
}
/*

Sports Task:
	1. Create a class named CobinGroup.Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of CobinGroup.Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google


 */