package day_31_MethodOverriding.statesTask;

public class Texas extends States {
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void weather() {
        System.out.println(getName()+" : In Texas the weather is bad");
    }
}
