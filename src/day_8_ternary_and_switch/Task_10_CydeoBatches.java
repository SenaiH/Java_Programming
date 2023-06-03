package day_8_ternary_and_switch;

public class Task_10_CydeoBatches {
    public static void main(String[] args) {
        String batch = "EU";
        String result = "";
//Solution 1.
        if (batch == "USmorning" || batch == "USevening" || batch == "EU"){
            if (batch == "USmorning") {
                result = "US Morning: Class times are 10-5 EST. M, T, Th, F.";
            } else if (batch == "USevening") {
                result = "US Evening: Class times are 7-10 EST. M, T, W, Th, S, S";
            } else { //if (batch=="EU") {
                result = "EU: Class times are  10-5 EST. M, T, W, Th, F.";
            }

    }else {
            result="Invalid Batch";
        }
        System.out.println(result);
        System.out.println("----------------------------------------");
 //Solution 2.
 switch (batch) {
     case "USmorning":
         result = "US Morning: Class times are 10-5 EST. M, T, Th, F.";
         break;
     case "USevening":
         result = "US Evening: Class times are 7-10 EST. M, T, W, Th, S, S";
         break;
     case "EU":
         result = "EU: Class times are  10-5 EST. M, T, W, Th, F.";
         break;
     default:
         result="Invalid Batch";
 }
        System.out.println(result);


        }
}
/*
Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */