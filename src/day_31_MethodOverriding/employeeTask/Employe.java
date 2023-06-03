package day_31_MethodOverriding.employeeTask;

public class Employe {
    private String name,jobtitle,companyName;
    private int age,id;
    private char gender;
    private double salary;

    public Employe(String name, String jobtitle, String companyName, int age, int id, char gender, double salary) {
        setName(name);
        setJobtitle(jobtitle);
        setCompanyName(companyName);
        setAge(age);
        setId(id);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){
            System.out.println("Invalid age");
            System.exit(1);
        }

        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        if(gender!='M'||gender!='F'){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.out.println("Invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }
public void work(){
    System.out.println(name + " is working ");
}

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
/*
employeeTask:
    1. Create a class named Employee
            Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()


    2. Create the following subclasses and override the work method in each subclass:

            1. Tester
                    work(): jobTitle + " " + name + " is testing"

            2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage

            3. Teacher
                    work(): name + " is teaching"

            4. Driver
                    work(): name + " is driving"


            if any adidtional field or methods needed, please add them
 */