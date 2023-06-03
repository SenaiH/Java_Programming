package day_28_OOP_Encapsulation.tester;

public class Tester {
 private String name,jobtitle;
 private char gender;
 private int age,id;
 private double salary;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        boolean isValid = gender=='M'||gender=='F';
        if(!isValid){
            System.err.println("Invalid Gender");
            System.exit(1);
        }

        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        boolean isValid = age>=18&&age<=65;
        if(!isValid){
            System.err.println("Invalid age");
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Invalid salay");
            System.exit(1);
        }

        this.salary = salary;
    }
    public void testing(){
        System.out.println(name + " is good at testing");
    }


    public void setInfo(String name, String jobtitle, char gender, int age, int id, double salary) {
        setName(name);
        setJobtitle(jobtitle);
        setGender(gender);
        setAge(age);
        setId(id);
        setSalary(salary);

    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement
 */