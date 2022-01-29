package day39_Recap.scrumTeamTask;

public class Tester extends Employee{

    private String testerType;

    public Tester(String name, int age, char gender, int id, double salary, String testerType) {
        super(name, age, gender, id, "Tester", salary);
        setTesterType(testerType);
    }

    public String getTesterType() {
        return testerType;
    }

    public void setTesterType(String testerType) {
        if(testerType.equalsIgnoreCase("Automation") && testerType.equalsIgnoreCase("Manual")&&testerType.equalsIgnoreCase("Full stack")){
            System.err.println("Invalid entry, please chose from Automation, Manual or Full stack");
            System.exit(1);
        }
        this.testerType = testerType;
    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " + getName() + "is creating ticket");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", testerType='" + testerType;
    }
}
