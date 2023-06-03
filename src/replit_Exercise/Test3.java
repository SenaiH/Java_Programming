package replit_Exercise;

public class Test3 {
    public static void main(String[] args) {

        String  first_name ="Noah";
        String last_name="Smith";
        String company_name="Apple";
        int salary=200000;
        int startDate=10;
        int startMonth=1;
        int startYear=2022;
        boolean isFulltime=true;
        String jobTitle="SDET";
        String officeAddress="One Apple Park Way, Cupertino, CA 95014";
        String FullName= first_name +""+ last_name;
        String fullStartDate= startMonth+","+startDate +","+startYear;
        String email=first_name+startDate+ "@"+company_name+".com";
        int Salary_after_2_years =(salary * 15/100)+salary;

        System.out.println("Employee Information");
        System.out.println("We have "+FullName+" joining " + company_name );
        System.out.println(first_name +" will start on "+ fullStartDate + " as full time: "+isFulltime);
        System.out.println(first_name+" here is some information about your employment");
        System.out.println("Your Email is "+ email );
        System.out.println("Your base salary is "+"$"+salary+" and after 2 years it will be "+"$"+Salary_after_2_years);//+"it will be"+salary * 15/100);
        System.out.println("Welcome abroad, see you at "+ officeAddress);

    }
}
/*
Employee Information
We have FULL_NAME joining COMPANY_NAME
FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
FIRST_NAME here is some information about your employment
Your email is EMAIL
Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
Welcome aboard, see you at ADDRESS
 */