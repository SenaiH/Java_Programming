package day_26_ConstruChainingStatics;

public class CydeoStudent {

    public String name,batchNumber,groupNumber;
    public int age,id;
    public char gender,grade;
    public static String schoolName = "Cydeo School";
    public static String magicWord = "No Magic Word";

    public CydeoStudent(String name, String batchNumber, String groupNumber, int age, int id, char gender, char grade) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }
public void study(){
    System.out.println(name + " studies at Cydeo School.");
}
public void attendClass(){
    System.out.println(groupNumber + " have attended class.");
}
public static void printSchoolname(){
    System.out.println("Cydeo School");
}
public static void printProgLanguage(){
    System.out.println("magicWord");
}

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
/*
CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */