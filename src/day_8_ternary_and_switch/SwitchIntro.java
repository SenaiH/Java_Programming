package day_8_ternary_and_switch;

public class SwitchIntro {
    public static void main(String[] args) {
        char grade = 'Q';
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        }
        if (grade == 'B') {
            result = "Great Job";
        }
        if (grade == 'C') {
            result = "Good";
        }
        if (grade == 'D') {
            result = "Passed";
        }
        if (grade == 'F') {
            result = "Failed";
        }else{
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("-------------------------------------------------");

switch(grade){
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Great Job");
        break;
    case 'C':
        System.out.println("Good");
        break;
    case 'D':
        System.out.println("Passed");
        break;
    case 'F':
        System.out.println("Failed");
        break;
    default:
        System.out.println("Invalid");
    //   break is optional after defualt.
}

    }
}




