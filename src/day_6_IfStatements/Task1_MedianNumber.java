package day_6_IfStatements;

public class Task1_MedianNumber {
    public static void main(String[] args) {
    int a = 20;
    int b = 21;
    int c = 10;
   String result = "";
    if(b>a&&b<c){
        result = b + " is the median number.";
    }if(a<b&&a>c){
        result = a + " is the median number.";
        }if(c<b&&c>a){
        result = c + " is the median number.";
        }
        System.out.println(result);
    }
}
/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */