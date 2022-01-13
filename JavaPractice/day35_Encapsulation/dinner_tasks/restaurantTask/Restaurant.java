package day35_Encapsulation.dinner_tasks.restaurantTask;

import day31_Constructors.Dinner.Chef;
import day31_Constructors.Dinner.Server;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String owner, location;
    private int numberOfStars;
    private ArrayList<Server> serversList = new ArrayList<>();
    private ArrayList<Chef> chefsList = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
       setOwner(owner);
       setLocation(location);
       setNumberOfStars(numberOfStars);
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        if(numberOfStars<=0){
            System.out.println("Invalid number of stars");
            return;
        }
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServersList() {
        return serversList;
    }

    public void setServersList(ArrayList<Server> serversList) {
        this.serversList = serversList;
    }

    public ArrayList<Chef> getChefsList() {
        return chefsList;
    }

    public void setChefsList(ArrayList<Chef> chefsList) {
        this.chefsList = chefsList;
    }

    public void hireServer(Server server){
        serversList.add(server);
    }
    public void hireServer(Server [] servers){
        serversList.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefsList.add(chef);
    }
    public void hireChef(Chef [] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefsList.removeIf(p-> p.employeeID==employeeID);
    }
    public void terminateServer(int employeeID){
        serversList.removeIf(p-> p.employeeID==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner: " + owner + '\'' +
                ", location: " + location + '\'' +
                ", number of stars: " + numberOfStars +
                ", number of servers: " + serversList.size() +
                ", number of chefs: " + chefsList.size() +
                '}';
    }
}
