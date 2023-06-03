package Utilities;

 // import day_27_StaticsAccessModifiers.Data;

 // import static day_27_StaticsAccessModifiers.Data.d;

  //import static day_27_StaticsAccessModifiers.Data.method3;

  import day_27_StaticsAccessModifiers.AccessModifiers;
  import day_27_StaticsAccessModifiers.Data;

  import static day_27_StaticsAccessModifiers.Data.*;

  public class Test2 {

      public static void main(String[] args) {

          //System.out.println(Data.d);

          System.out.println(d);

          method3();
          method4();

          System.out.println(f);
          System.out.println(e);

          System.out.println("-----------------------------------------");

          System.out.println(AccessModifiers.publicData);
          // System.out.println(AccessModifiers.ProtectedData); is not always accessible outside package.
         // System.out.println(AccessModifiers.defaultDate); Not accessible outside package.
         // System.out.println(AccessModifiers.privateData);

      }
}
