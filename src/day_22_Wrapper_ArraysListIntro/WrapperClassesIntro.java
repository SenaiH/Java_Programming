package day_22_Wrapper_ArraysListIntro;

public class WrapperClassesIntro {
    public static void main(String[] args) {

       String str = "Java";

       int a1 = 10;
       Integer a2 =10;

        System.out.println("______________________________");

        int b1 =100;

        double c1 =b1;
        long c2 = b1;

        Integer b2 = b1;   //Autoboxing


        // Long b3 =b1;
        // Double b4 =b1;

        char ch = 'A';
        Character chr = ch;  //Autoboxing

        double d1 =5.5;
        Double d2 =d1;  //Autoboxing

        System.out.println("______________________________");

       Integer n2 =20;

       int  n3 =n2;  //Unboxing
       //long n4 =n2;
        //double n5 =n2;
    }


}
