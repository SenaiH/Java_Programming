package day_25_DateTimeContnueConstructorIntro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023, 5, 18, 11, 0);

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());


        System.out.println(starts.getHour());

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("EEEE,Y,H,m,a");
        System.out.println(starts.format(dft));
        System.out.println(ends.format(dft));


    }

}
