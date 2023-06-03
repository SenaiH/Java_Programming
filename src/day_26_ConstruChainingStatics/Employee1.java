package day_26_ConstruChainingStatics;

public class Employee1 {
 public String name;
 public char gender;
 public String jobtitle;
 public double salary;

    public Employee1(String name) {
        this.name = name;
    }

    public Employee1(String name,char gender) {
        this(name);
        this.gender = gender;
    }
    public Employee1(String name,char gender,String jobtitle){
        this(name,gender);
        this.jobtitle=jobtitle;
    }

    public Employee1(String name,char gender,String jobtitle,double salary) {
        this(name,gender,jobtitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
Class Name: Employee
	Instance variables:
			name, gender, jobTitle, salary

		1st cosntructor: initializes the name only

		2nd constructor: initializes name and gender

		3rd constructor: initializes name, gender and jobTitle

		4th constructor initializes name, gender, jobTitle, Salary

		5th constructor: initializes name, jobTitle

		6th constructor: initializes name jobTitle, salary

	Instnace methods:
		toString

 */