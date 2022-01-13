package day31_Constructors.Dinner;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Cassandra", "California", 5);

        Server server1 = new Server("Anna", 001, 45, true);
        Server server2 = new Server("Zanna", 002, 45, true);
        Server server3 = new Server("Manna", 003, 45, false);
        Server server4 = new Server("Vanna", 004, 45, false);
        Server server5 = new Server("Tanna", 005, 45, false);
        Server [] servers = {server2, server3, server4, server5};

        restaurant1.hireServer(server1);
        restaurant1.hireServer(servers);


        Chef chef1 = new Chef("Barack Obama", 562, 40, true);
        Chef chef2 = new Chef("Taylor Swift", 458, 55, true);
        Chef chef3 = new Chef("Hillary Clinton", 326, 32, false);
        Chef[] chefs = {chef2, chef3};

        restaurant1.hireChef(chef1);
        restaurant1.hireChef(chefs);
        System.out.println("Restaurant info: ");
        System.out.println(restaurant1);

        restaurant1.terminateChef(458);
        restaurant1.terminateServer(002);
        restaurant1.terminateServer(003);

        System.out.println("After pandemic: ");
        System.out.println(restaurant1);

        int j = 0;
        for(Chef each: restaurant1.chefsList){
            if(j%2==0){
                each.makeOrder();
            } else {
                each.washDishes();
            }
            j++;
        }


    }
}
