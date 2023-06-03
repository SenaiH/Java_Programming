package day_31_MethodOverriding.studentTask;

public class TestStudentObject {
    public static void main(String[] args) {
        Student student = new Student("Senai",36,'M',"B34","SDET","Cydeo",'A');
  UndergradStudent un = new UndergradStudent("Senait",35,'F',"B45","SDET","Cydeo",'B');
  GraduateStudent grd = new GraduateStudent("Salem",36,'F',"B76","Java","Botiego",'C');
  CydeoStudent cydstu = new CydeoStudent("Selam",34,'M',"B54","Business","California",'D',24,4,"Python");


        System.out.println(student);
        System.out.println(un);
        System.out.println(grd);
        System.out.println(cydstu);

   student.study();
   un.eat();
   grd.drink();
   cydstu.sleep();
   cydstu.study();
   cydstu.drink();
   cydstu.eat();

    }
}
