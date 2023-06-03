package day_17_CustomClass;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Senai",'M',36,"ADGR763",'A',true);

        Student student2 = new Student();
        student2.setInfo("Daniel",'M',26,"AGR763",'A',true);

        Student student3 = new Student();
        student3.setInfo("Almaz",'F',46,"GR763",'A',false);

        Student student4 = new Student();
        student4.setInfo("Senait",'F',23,"ADG63",'A',true);

        Student student5 = new Student();
        student5.setInfo("Salem",'F',25,"ADGR3",'A',true);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        student1.study();
        student3.study();

    }


}
