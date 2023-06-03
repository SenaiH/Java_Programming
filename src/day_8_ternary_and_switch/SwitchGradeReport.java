package day_8_ternary_and_switch;

public class SwitchGradeReport {
    public static void main(String[] args) {
        int score = 97;
        String result = "";
        if(score>=96) {
            result = " your grade is: A";
        }else if(score >=80&&score<95){
            result = " your grade is: B";
        }else if (score>=70&&score<80){
            result = " your grade is: C";
        }else if(score>=60&&score<70){
            result = " your grade is: D";
        }else{
            result = " your grade is: F";
        }
        System.out.println(result);

        System.out.println("---------------------------------------");

        switch(score){
            case 95:
                result = " your grade is: A";
                break;
            case 80:
                result = " your grade is: B";
                break;
            case 70:
                result = "your grade is: C";
                break;
            case 60:
                result = "your grade is: D";
                break;
            default:
                result = "your grade is: F";
        }
        System.out.println(result);
    }

}
