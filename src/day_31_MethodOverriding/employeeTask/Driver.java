package day_31_MethodOverriding.employeeTask;

public class Driver extends Employe {

    public Driver(String name, String jobtitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobtitle, companyName, age, id, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
