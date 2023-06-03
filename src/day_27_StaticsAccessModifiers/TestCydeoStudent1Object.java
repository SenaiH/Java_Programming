package day_27_StaticsAccessModifiers;

public class TestCydeoStudent1Object {
    public static void main(String[] args) {
        CydeoStudent1 student = new CydeoStudent1("Senai","B29","Ancestor",'M',36);

        System.out.println(student);
        System.out.println(CydeoStudent1.fieldOfStudy);

        CydeoStudent1.printSchoolName();
        CydeoStudent1.printSecretCode();

        student.attendClass();
        student.study();
    }

}
