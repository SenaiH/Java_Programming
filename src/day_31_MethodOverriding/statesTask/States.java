package day_31_MethodOverriding.statesTask;

public class States {
private String name, abbreviation, politicalParty, Governor, senator;
private long population;
private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
       if(name==null){
           System.out.println("Invalid name");
           System.exit(1);
       }
        return name;
    }

    public void setName(String name) {
      if(name.isEmpty()||name.isBlank()){
          System.out.println("Invalid name");
          System.exit(1);
      }

        this.name = name;
    }

    public String getAbbreviation() {
       if(abbreviation==null){
           System.out.println("Invalid abbreviation");
           System.exit(1);
       }
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isBlank()||abbreviation.isEmpty()){
            System.out.println("Invalid abbreviation");
            System.exit(1);
        }

        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        if(politicalParty==null){
            System.out.println("Invalid party");
            System.exit(1);
        }

        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
       if(politicalParty.isEmpty()||politicalParty.isBlank()){
           System.out.println("Invalid party");
           System.exit(1);
       }

        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        if(Governor==null){
            System.out.println("Invalid gov");
            System.exit(1);
        }

        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor.isBlank()||governor.isEmpty()){
            System.out.println("Invalid gov");
            System.exit(1);
        }

        Governor = governor;
    }

    public String getSenator() {
        if(senator==null){
            System.out.println("Invalid senator");
            System.exit(1);
        }

        return senator;
    }

    public void setSenator(String senator) {
        if(senator.isEmpty()||senator.isBlank()){
            System.out.println("Invalid senator");
            System.exit(1);
        }

        this.senator = senator;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
       if(population<=0){
           System.out.println("Invalid population number");
           System.exit(1);
       }

        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.out.println("Invalid tax");
            System.exit(1);
        }

        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
public void weather(){
    System.out.println("In " + name + " the weather is good");
}
}
/*
statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

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