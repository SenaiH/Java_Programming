package day_31_MethodOverriding.studentTask;

public class Person {
private String name;
private int age;
private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
       if(name==null){
           System.out.println("Invalid name");
           System.exit(1);
       }

        return name;
    }

    public void setName(String name) {
        if(name.isBlank()||name.isEmpty()){
            System.out.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age<0) {
           System.out.println("Invalid age");
           System.exit(1);
       }

        this.age = age;
    }

    public char getGender() {
        if(gender!='M'||gender!='F'){
            System.out.println("Invalid");
            System.exit(1);
        }

        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }
public void eat(){
    System.out.println(name + " is eating food");
}
public void drink(){
    System.out.println(name + " is drinking water");
}
public void sleep(){
    System.out.println(name + " is sleeping");
}


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
