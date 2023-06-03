package day_31_MethodOverriding.studentTask;

public class CydeoStudent extends Student {
private int batchNumber,groupNumber;
private String progLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String progLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgLanguage(progLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.out.println("Invalid");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
       if(groupNumber<=0){
           System.out.println("Invalid");
           System.exit(1);
       }

        this.groupNumber = groupNumber;
    }

    public String getProgLanguage() {
        if(progLanguage==null){
            System.out.println("Invalid");
            System.exit(1);
        }

        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
       if(progLanguage.isEmpty()){
           System.out.println("Invalid");
           System.exit(1);
       }

        this.progLanguage = progLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats while studing "+ getProgLanguage());
    }

    @Override
    public void drink() {
        System.out.println(getName()+" drinks while studying "+getProgLanguage());
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps while studying "+progLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")  +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", progLanguage='" + progLanguage + '\'' +
                '}';
    }
}
