package day_28_OOP_Encapsulation.encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private int age,dateOfBirth;
    private char gender;
   // private LocalDate ;


    public String getName() {
       if(name==null){
           System.out.println("Unknown");
           System.exit(1);
       }

        return name;
    }

    public void setName(String name) {
       if(name==" "||name.isBlank()||name.isEmpty()) {
           System.out.println("Invalid Name");
           System.exit(1);
       }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>120){
            System.out.println("Invalid Age");
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='M'&& gender!='F'){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        if(dateOfBirth>2023){
            System.out.println("Invalid DoB");
            System.exit(1);
        }

        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int age, char gender, int dateOfBirth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
}

/*
name, age,gender,dateOfBirth

name :  write can't be null/empty/blank
       Read: if name is not, return "Unknown" instead

 age: write: age can't be <0||>120.

 gender: write gender can only be 'M' or 'F'

 dateOfBirth : write can't be after today's date.

 Add a constructor that can set all the fields.

 */