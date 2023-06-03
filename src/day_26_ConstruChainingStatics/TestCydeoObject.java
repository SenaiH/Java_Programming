package day_26_ConstruChainingStatics;

public class TestCydeoObject {
    public static void main(String[] args) {
        CydeoStudent c1 = new CydeoStudent("Senai","B-29","Ancestor",36,56,'M','A');

        System.out.println(c1);
        c1.attendClass();
        c1.study();

        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolname();

        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.magicWord);

    }
}
