package trail_and_error;

import java.util.Arrays;

public class StreamTrial {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};

        num = Arrays.stream(num).distinct().toArray();

        System.out.println(Arrays.toString(num));

        num = Arrays.stream(num).skip(4).toArray();

        System.out.println(Arrays.toString(num));
    }

}
