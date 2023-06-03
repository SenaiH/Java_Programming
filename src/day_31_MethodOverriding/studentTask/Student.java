package day_31_MethodOverriding.studentTask;

public class Student extends Person {
private String studentId, fieldOfStudy,schoolName;
private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        if(fieldOfStudy==null){
            System.out.println("Invalid field");
            System.exit(1);
        }

        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isEmpty()){
            System.out.println("Invalid field");
            System.exit(1);
        }

        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        if(schoolName==null){
            System.out.println("Invalid");
            System.exit(1);
        }

        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName.isEmpty()){
            System.out.println("Invalid school");
            System.exit(1);
        }

        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
       if(grade!='A'&& grade!='B'&& grade!='C'&& grade!='D' && grade!='F') {
           System.out.println("Invalid grade result");
           System.exit(1);
       }

        this.grade = grade;
    }
public void study(){
    System.out.println(getName() + " studies hard");
}

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
