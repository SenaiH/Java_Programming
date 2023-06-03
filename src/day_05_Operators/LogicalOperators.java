package day_05_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        double salary = 60000;
        double creditScore = 650;
        int age = 25;

        boolean isElgibleForLoan = salary >= 60000 && creditScore >= 650 && age >= 25;
        System.out.println(isElgibleForLoan);

        // boolean isElgibleForLoan= salary>=60000&&creditScore>=650&&age>=25;
        //System.out.println(isElgibleForLoan);====>false

        System.out.println("-------------------------------------------");

        int age1 = 25;
        String country = "USA";
        Boolean isEligibleToVote = age1 >= 21 && country == "USA";
        System.out.println(isElgibleForLoan);

        System.out.println("-------------------------------------------");
        String answer = "May be";

        boolean isValidAnswer = answer == "Yes" || answer == "No";
        System.out.println(isValidAnswer);

        boolean isValid = answer == "May be" || answer == "No";
        System.out.println(isValid);

        System.out.println("-------------------------------------------");

        char grade = 'B';
        boolean isPassed = grade == 'C' || grade == 'A' || grade == 'B';
        System.out.println(isPassed);

        System.out.println("-------------------------------------------");

        System.out.println(!true);
        String a = "Yes";
        boolean yes = a == "Yes";
        System.out.println(yes);
        boolean no = !yes;
        System.out.println(no);


        System.out.println("--------------------------");

        int score = 65;
        boolean ispassed= score>=65;
        boolean isFailed=!ispassed;

        System.out.println("isFailed = " + isFailed);
        System.out.println("ispassed = " + ispassed);

        System.out.println("--------------------------------------------");

        System.out.println(true==!false && false==!true && true != !true);
        //                   true       &&    true      &&   true
    }
}
