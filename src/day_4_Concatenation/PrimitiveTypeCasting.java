package day_4_Concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //------Implicit Casting--------

    byte a = 15;
    short b = a;//short b = (short)a;
        System.out.println(b);
 int c = b;
        System.out.println(c);
 long d =3000l;
 float e = d;
        System.out.println(d);

        //----Explicit Casting-------

   int x = 100;
   byte y = (byte) x;
 float z = 20.8f;
 short q = (short) z;

  double n1 = 2.5;
  byte n2 = (byte) n1;

  int num = 500;
  byte result= (byte) 500;

  int r =50000;
  short t = (short) 50000;

  double u = 3000.5;
  int p = (int) 3000.5;

  int d1 =100;
  double d2 = 100;//Implicit

        System.out.println(q);
        System.out.println(y);
        System.out.println(n2);
        System.out.println(result);
        System.out.println(t);
        System.out.println(p);
        System.out.println(d2);// Decimal Result

    }

}
