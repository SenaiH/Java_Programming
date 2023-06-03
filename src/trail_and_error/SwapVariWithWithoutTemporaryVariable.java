package trail_and_error;

public class SwapVariWithWithoutTemporaryVariable {
    public static void main(String[] args) {

        int x = 10;//apple
        int y = 15;//orange
       // String name = "Salem";

        int temp = x;
     //with out temp variable===got wrong???
       // x = x+y;
        //y = y-x;
       // x=x+y;

        // swap with temp variable

        x = y;
       y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        

    }
}
/*

 */