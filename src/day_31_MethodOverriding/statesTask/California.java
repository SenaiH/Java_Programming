package day_31_MethodOverriding.statesTask;

public class California extends States {
    public California(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void weather() {
        System.out.println(getName() + " : In California the weather is good");
    }
}
