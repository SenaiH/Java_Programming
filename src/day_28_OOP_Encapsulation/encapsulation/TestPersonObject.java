package day_28_OOP_Encapsulation.encapsulation;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Senai",36,'M',1800);

        System.out.println(person1);

        person1.setName("Daniel");
        System.out.println(person1.getName());

        person1.setAge(67);
        System.out.println(person1.getAge());

        person1.setGender('F');
        System.out.println(person1.getGender());
    }


}
