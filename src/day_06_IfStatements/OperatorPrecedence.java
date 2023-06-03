package day_06_IfStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(5 + 2 * 3);
        System.out.println(7 - 3 + 2/2); // if operation has the same order of precedence, we operate which ever  comes first
        System.out.println(7 + 3 - 2/2); // if operation has the same order of precedence, we operate which ever  comes first
        System.out.println(-5 + 3);
        System.out.println(10>9==8<7&&"Java"=="Python"|| 'a'=='A');
            //            true==false && false || false
            //           false && false || false
           //                  false  || false
        //                           false

        System.out.println(100 >=20 && 40 * 2 > 60);
        //                 100 >=20 && 80 > 60
        //                  true && true
        //                       true


        int a = 20;
        a += 10 + 2 * 3;
        //a= 20 + 10 +2 * 3
        //a=36
        System.out.println(a);


    }


}
