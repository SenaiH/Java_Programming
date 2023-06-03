package trail_and_error;

public class Test_TellPersonalityType {
    public static void main(String[] args) {
    tellMyPersonality(2);
    tellMyPersonality(3);
    tellMyPersonality(7);
    tellMyPersonality(4);

    }
    public static void tellMyPersonality(int num1){

        if(num1%2==0){
            System.out.println("Fair");
        } else if (num1%2!=0) {
            System.out.println("Biased");
        }

    }


}
/*
Write a function, tellMyPersonality, that takes a number parameter and returns the
personality type based on argument supplied.
a. If the argument is an even number function should return “Fair”
b. Otherwise, it should return “Biased”
E.g.,
tellMyPersonality(4) returns "Fair"
tellMyPersonality(3) returns "Biased"
 */