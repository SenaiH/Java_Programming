package trail_and_error;

public class Intreview {
    public static void main(String[] args) {


        int[] list = {-4, -2, 2, 4, 6, 9};

        for (int each : list) {
            if(list[each]==each){
                System.out.println(each); 
            }

        }
    }
}
