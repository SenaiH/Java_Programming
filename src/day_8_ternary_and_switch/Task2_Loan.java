package day_8_ternary_and_switch;

public class Task2_Loan {
    public static void main(String[] args) {
        int salary =100000;
        int creditscore =680;
        String result ="";
        result=(salary>=60000&&creditscore>=650)?"Loan Approved":"Loan Denied";
        System.out.println(result);
    }

}
/*
Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */