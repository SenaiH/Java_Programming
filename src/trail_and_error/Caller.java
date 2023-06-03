package trail_and_error;

public class Caller {

    static String b = "";
    String d = "a";
private void init(){
    System.out.println("Intia");
}
private void start(){
    init();
    System.out.println("start");
}

//}
//public class TestCall(){
    public static void main(String[] args) {
        Caller c =  new Caller();
        //c.start();
        //c.init();
    }
}