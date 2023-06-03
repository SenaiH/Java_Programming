package day_17_CustomClass;

public class Employee {
   public String name;
   public int age;
   public char gender;
   public String jobtitle;
   public double salary;
   public String id;

    public void setInfo(String name, int age, char gender, String jobtitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.id = id;
        // sets all the attributes of the employee object at once
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){
    System.out.println(name + " is working");
}


}
