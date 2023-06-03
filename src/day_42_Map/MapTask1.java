package day_42_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {

        Map<String, int[]> scores = new HashMap<>();
        scores.put("Senai",new int[]{90,80,70,60,50});
        scores.put("Senait",new int[]{90,100,50,90,80});
        scores.put("Selam",new int[]{50,60,70,80,90});
        scores.put("Salem",new int[]{90,80,100,60,50});
        scores.put("Samri",new int[]{100,80,70,60,50});

        for (String each : scores.keySet()) {
            System.out.println(each + " "+ Arrays.toString(scores.get(each)));
        }
        System.out.println("------------------------------------------------");


}
}
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores

 */