package day_30_InheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person{

private String employeeId;
private String jobtitle;
private double salary;

    public Employee(String name, char gender, LocalDate DOB, String employeeId, String jobtitle, double salary) {
        super(name, gender, DOB);
        this.employeeId = employeeId;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println(getName()+" is working");
    }

}
