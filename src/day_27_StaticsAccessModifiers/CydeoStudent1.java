package day_27_StaticsAccessModifiers;

public class CydeoStudent1 {
public String name,batchNumber,groupNumber;
public char gender;
public int age;

public static String schoolName,fieldOfStudy,programmingLanguage,secretCode;

    public CydeoStudent1(String name, String batchNumber, String groupNumber, char gender, int age) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.age = age;
    }
static {
       schoolName = "Cydeo School";
       fieldOfStudy= "SDET Java";
       programmingLanguage = "Java";
       secretCode = "Steel Fork";

}
public static void printSchoolName(){
    System.out.println(schoolName);
}
public static void printSecretCode(){
    System.out.println(secretCode);
}
public void attendClass(){
    System.out.println("300 People attend class");
}
public void study(){
    System.out.println(name + " studies at Cydeo School.");
}


    public String toString() {
        return "CydeoStudent1{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */