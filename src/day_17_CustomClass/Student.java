package day_17_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public String studentId;
    public char grade;
    public boolean isFulltime;

    public void setInfo(String name, char gender, int age, String studentId, char grade, boolean isFulltime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFulltime = isFulltime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFulltime=" + isFulltime +
                '}';
    }
public void study(){
    System.out.println(name + " studies hard for the examination");
}

}
/*
Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */