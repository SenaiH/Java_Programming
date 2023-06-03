package day_25_DateTimeContnueConstructorIntro;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Daniel",25,'M',LocalDate.of(2022, 12, 2),false,true);

        System.out.println(person1);
        person1.eat("Salad");
        person1.sleeping(12);
        person1.drinking("Alchol");

        Person person2 = new Person("Salem",30,'F',LocalDate.of(2020, 12, 2),true,true);

        System.out.println(person2);

        person2.eat("Apple");
        person2.sleeping(7);
        person2.drinking("Juice");

    }

}
