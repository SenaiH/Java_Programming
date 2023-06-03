package day_14_forLoop;

public class MethodOveloadingPractice {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println("------------------------------");
        System.out.println(sum(10.5,20.7));
        System.out.println(sum(10.4,20.3,30.5,40.7));
        System.out.println(sum(10.5,20.6,30.7));
        System.out.println("------------------");
        System.out.println(sum(1,2.3,4.3,7));

    }
    public static int sum(int num1,int num2) {
      return  num1 +num2;

    }public static int sum(int num1,int num2,int num3) {
        return  sum (num1,num2) +num3;
    }public static int sum(int num1,int num2,int num3,int num4){
        return sum(num1,num2,num3)+num4;
    }public static double sum(double num1,double num2){
        return num1 + num2;
    }public static double sum(double num1,double num2,double num3){
        return sum(num1,num2)+num3;
    }public static double sum(double num1,double num2,double num3,double num4){
        return sum(num1,num2,num3)+num4;
    }


}
/*
Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */