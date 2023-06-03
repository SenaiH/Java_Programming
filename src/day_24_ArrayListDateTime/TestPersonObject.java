package day_24_ArrayListDateTime;

import day_17_CustomClass.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1889, 2, 25));
        people[1].setInfo("Senai", 'M', LocalDate.of(1986, 7, 20));
        people[2].setInfo("Senait", 'F', LocalDate.of(1987, 1, 15));
        people[3].setInfo("Dawit", 'M', LocalDate.of(1900, 5, 5));
        people[4].setInfo("Salem", 'F', LocalDate.of(1999, 1, 11));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people));

      //  studentsList.removeIf(each->each.age>55);

        for (Person each : studentsList) {
            System.out.println(each.name + " " + each.dateOfBirth);
        }

        System.out.println("------------------------");



        // remove all the person object that has the age > 55

        // print name & date of birth of each person object

    }

}
