package day_31_MethodOverriding.statesTask;

public class Virginia extends States {
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void weather() {
        System.out.println(getName()+" : In Virginia the weather is moderate");
    }
}
