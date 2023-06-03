package trail_and_error;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        char[]array = {'A','B','C','D'};
        Arrays.sort(array);

        for (char each : array) {
            System.out.println(each + " ");
       if(each=='D'){
           continue;   // [A,B,C,D]
       }
        }
    }

}
