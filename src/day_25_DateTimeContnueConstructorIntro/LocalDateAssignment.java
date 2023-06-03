package day_25_DateTimeContnueConstructorIntro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAssignment {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE,h:m:a,MMM/d/y");
        LocalDateTime dtime = LocalDateTime.now();

        System.out.println(dtime.format(df));
    }

}
