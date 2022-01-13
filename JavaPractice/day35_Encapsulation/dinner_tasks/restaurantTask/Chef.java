package day35_Encapsulation.dinner_tasks.restaurantTask;

public class Chef {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
       setName(name);
       setEmployeeID(employeeID);
       setHourlyRate(hourlyRate);
       setFullTime(fullTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.out.println("Invalid employee ID");
            return;
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+" is making an order");
    }
    public void washDishes(){
        System.out.println(name+" is washing the dishes");
    }

    public String toString() {
        String fullPartTime = (fullTime)? "full-time" : "part-time";
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullPartTime +
                '}';
    }
}
