package day_28_OOP_Encapsulation.developer;

public class Developer {
private String name,jobtitle,programmingLanguage;
private char gender;
private int age,id;
private double salary;

    public void setInfo(String name, String jobtitle, String programmingLanguage, char gender, int age, int id, double salary) {
        setName(name);
        setJobtitle(jobtitle);
        setProgrammingLanguage(programmingLanguage);
        setGender(gender);
        setAge(age);
        setId(id);
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
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
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement
 */