package day_09_ScannerI_ntro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Scanner_ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("src/day_9_ScannerI_ntro/Test.txt"));

        System.out.println(scan.next());
        System.out.println(scan.next());
        scan.nextLine();
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

        System.out.println(scan.hasNext());
        System.out.println(scan.hasNextLine());



        //If text file is empty it give you compile error.
    }

}
