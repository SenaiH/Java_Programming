package day_25_DateTimeContnueConstructorIntro;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {


    Employee e1 = new Employee("Khashayar", 32, 'M', "Java Developer", 95000, LocalDate.of(2022, 12, 2));

    Employee e2 = new Employee("Mohammad", 31, 'M', "Project Manager", 120000, LocalDate.of(2021, 5, 1));

    Employee e3 = new Employee("Senait",34,'F',"Engineer",150_000,LocalDate.of(2020,12,2));


        System.out.println(e1);

        System.out.println(e2);

        System.out.println(e3);

}

}
