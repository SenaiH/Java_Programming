package day_13_CustomMethodContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {
     // int total = sum(40,20)===> sum is void method doesn't return any data.
       int total1= addition(20,10);
        System.out.println(total1);
        System.out.println("-----------------");
       int total = addition(15,5);
        System.out.println(total);
        System.out.println("-----------------");
  int t=  square(5);
        System.out.println(t);
        System.out.println("-----------------");
        square(6);
        int t1 = square(6);
        System.out.println(t1);
        System.out.println("-----------------");
int a = cube(5);
        System.out.println(a);
        System.out.println("-----------------");
        int b = cube(7);
        System.out.println(b);
        System.out.println("-----------------");
    }
  /*  public static void sum(int num1,int num2){
        int result = num1+num2;
        System.out.println(result);
    }*/



    public static int addition(int n1,int n2){
     int result = n1 + n2;
     return result;

    }
    public static int square(int num){
        int square = num*num;
        return square;
    }
    public static int cube(int num){

        int cube = square(num)*num;
        return cube;
    }



}
