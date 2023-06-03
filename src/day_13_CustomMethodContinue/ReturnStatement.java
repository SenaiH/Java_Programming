package day_13_CustomMethodContinue;

public class ReturnStatement {
    public static void main(String[] args) {
  elegible(25);
  elegible(149);

        System.out.println("-------------------------");

        System.out.println("Test Started");

        boolean exit = true;

        if(exit){
          return;
        }

        System.out.println("Test1 started");
        System.out.println("Test2 started");



    }

    public static void elegible(int age){

        if(age<0||age>150){
            System.err.println(age + " Inavalid");
            return;// if age is invalid,then this gets terminated.
        }
    if(age>=21){
        System.out.println("Elegible");
    }else{
        System.out.println("Not elegible");
    }

    }


}
