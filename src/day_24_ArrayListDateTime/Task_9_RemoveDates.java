package day_24_ArrayListDateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_9_RemoveDates {
    public static void main(String[] args) {
      ArrayList<LocalDate>localDates = new ArrayList<>();
      localDates.addAll(Arrays.asList(LocalDate.of(1999,8,7),LocalDate.of(2020,3,3),LocalDate.of(1989,3,3)));

        localDates.removeIf(l->l.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(localDates);


    }

}
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */