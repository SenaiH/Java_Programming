package trail_and_error;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Terenary {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of(""));

        int score = 76;
        String result = "";
        result = (score > 75 && score <= 100) ? (score >= 85) ? "Passed" : "Failed" : "Invalid result";
        System.out.println(result);
        int num = 10;
        System.out.println(++num);//11
        System.out.println(--num);// 10
        System.out.println(num++);//10
        System.out.println(num--);//11

       // String str = new String("")


    }
}
/*
Discord Assignment

1. "="   ->Assignment and "==" ->Equality.
2.  ++num= 11 , --num=10,  num++=10, num--=11.
3.&&--->3.1 False, 3.2 False, 3.3 False, 3.4 True.
3. || ---> 3.1 False, 3.2 True, 3.3 True, 3.4 True.
 */