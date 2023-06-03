package day_8_ternary_and_switch;

public class FieldTrip_WarmUpTask {
    public static void main(String[] args) {
        int gradeNumber = 5;
        String result = "";
        if (gradeNumber >= 1 && gradeNumber <= 4) {
            if (gradeNumber == 1) {
                result = "Location-Apple Orchard.\nNumber of groups-3.\nTeacher in charge-Ms.Smith.";
            } else if (gradeNumber == 2) {
                result = "Location-Zoo.\nNumber of groups-7.\nTeacher in charge-Mr.Lee.";
            } else if (gradeNumber == 3) {
                result = "Location-Aquarium.\nNumber of groups-5.\nTeacher in charge-Ms.Wilson.";
            } else {
                result = "Location-Movie Theater.\nNumber of groups-2.\nTeacher in charge-Ms.Reyes.";
            }
        } else {
            result = "Invalid!";
        }
        System.out.println(result);
        System.out.println("--------------------------------");

        String location = "";
        int numGroups = 0;
        String teacher = "";

        if (gradeNumber >= 1 && gradeNumber <= 4) {
           if(gradeNumber==1){
               location = "Apple Orchard.";
               numGroups = 3;
               teacher = "Ms.Smith.";
           } else if (gradeNumber==2) {
               location = "Zoo";
               numGroups = 7;
               teacher = "Mr.Lee.";
           } else if (gradeNumber==3) {
               location = "Aquarium";
               numGroups = 5;
               teacher = "Ms.Wilson.";

           }else{
               location = "Movie Theater";
               numGroups = 2;
               teacher = "Ms.Reyes.";

           }

        }else{
            location = "Invalid";
            numGroups = 0;
            teacher = "Invalid";
        }
        System.out.println("location = " + location);
        System.out.println("numGroups = " + numGroups);
        System.out.println("teacher = " + teacher);

    }
}
