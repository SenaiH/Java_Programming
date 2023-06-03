package day_29_Inheritance.employeeTask;

public class Developer extends Person {

private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        boolean isValid = programmingLanguage.equals("Java")||programmingLanguage.equals("JavaScript")||programmingLanguage.equals("Python")||programmingLanguage.equals("Ruby")||programmingLanguage.equals("C#")||programmingLanguage.equals("C++")||programmingLanguage.equals("Swift");
        if(!isValid){
            System.out.println("Invalid Programming Lnaguage");
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;

    }
    public void language(){
        System.out.println(getName() + " uses "+getProgrammingLanguage() + " programing language");
    }
public void coding(){
    System.out.println(getName()+ " is a very good programmer");
}
}
