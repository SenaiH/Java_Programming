package day_26_ConstruChainingStatics.studentTask;

public class Student {
public String name,id;
public char gender;
public int age;

    public Student(String name, String id, char gender, int age) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
public void study(){
    System.out.println(name + " Studies hard for the Exam");
}

    public static void main(String[] args) {
        Student student1 = new Student("Abraham","ABC14",'M',35);
        System.out.println(student1);
        student1.study();
    }

}


/*
1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */