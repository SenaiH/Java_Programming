package day_29_Inheritance.employeeTask;

public class Person {
private String name,jobtitle,id;
private char gender;
private int age;
private double salary;

    public void setInfo(String name, String jobtitle, String id, char gender, int age, double salary) {
        setName(name);
        setJobtitle(jobtitle);
        setId(id);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }
public void drink(){
    System.out.println(name + " likes to drink water");
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        boolean isValid = gender=='M'||gender=='F';
        if(!isValid){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        boolean isValid = age >=18&&age<=65;
        if(!isValid){
            System.out.println("Invalid age");
            System.exit(1);
        }

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.out.println("Invalid Salary");
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
