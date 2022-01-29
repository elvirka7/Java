package day39_Recap.statesTask;

public class States {
    private String name, abbreviation, politicalParty, Governor, senator;
    private int population;
    private double stateTaxRate;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTaxRate) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTaxRate(stateTaxRate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null) {
            System.err.println("Invalid state name entry");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isEmpty() || abbreviation.isBlank() || abbreviation == null) {
            System.err.println("Invalid abbreviation entry");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isEmpty() || politicalParty.isBlank() || politicalParty == null) {
            System.err.println("Invalid political party entry");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor.isEmpty() || governor.isBlank() || governor == null) {
            System.err.println("Invalid governor entry");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isBlank() || senator == null) {
            System.err.println("Invalid senator entry");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0) {
            System.err.println("Invalid population entry");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTaxRate() {
        return stateTaxRate;
    }

    public void setStateTaxRate(double stateTaxRate) {
        if (stateTaxRate < 0) {
            System.err.println("Invalid state tax rate entry");
            System.exit(1);
        }
        this.stateTaxRate = stateTaxRate;
    }

    public void isKnownFor(){
        System.out.println(" ");
    }

    public String toString() {
        return "\nname=" + name + '\'' +
                ", abbreviation=" + abbreviation + '\'' +
                ", politicalParty=" + politicalParty + '\'' +
                ", Governor=" + Governor + '\'' +
                ", senator=" + senator + '\'' +
                ", population=" + population +
                ", stateTaxRate=" + stateTaxRate;
    }
}
/*
States Task:
	1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()


	2. Create the following sub classes of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida


	3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes


 */