package day_05_Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        //Pre Increment/Decrement
   int x= 10;

        System.out.println(++x); //11
        System.out.println(x); //11
        System.out.println(x);

        int y =100;

        System.out.println(--y); //99
        System.out.println(y);  //99
        System.out.println(y);

    // Post Increment/Decrement
        System.out.println("__________________________________________");
        int a= 10;

        System.out.println(a++); //10
        System.out.println(a);//11
        System.out.println(a);

        int b =100;

        System.out.println(b--); //100
        System.out.println(b);  //99
        System.out.println(b);


        int n = 30;
        int m = n++;

        System.out.println(n);
        System.out.println(m);

        int q = 20;
        int r = q--;

        System.out.println(q);
        System.out.println(r);
    }


}
