package day_31_MethodOverriding.employeeTask;

public class Developer extends Employe {
private String programmingLanguage;

    public Developer(String name, String jobtitle, String companyName, int age, int id, char gender, double salary, String programmingLanguage) {
        super(name, jobtitle, companyName, age, id, gender, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobtitle() + " " + getName() + " is coding in " + getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
