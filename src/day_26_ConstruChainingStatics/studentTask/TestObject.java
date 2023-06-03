package day_26_ConstruChainingStatics.studentTask;

public class TestObject {
    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", "A16", 'M',21 );

        Student student2 = new Student("Glenio", "B34", 'M',24 );
        Student student3 = new Student("Sumeyye", "C56", 'F',22 );
        Student student4 = new Student("Mehmet", "D43", 'M',25 );
        Student student5 = new Student("Sebastian", "E27", 'M',23 );

        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles",  1);

        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);


        for (Student each : group1.students) {
            System.out.println(each.name +" : " + each.id);
        }

        System.out.println("------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup[] groups = {group1, group2, group3, group4};
    }

}
/*
Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */