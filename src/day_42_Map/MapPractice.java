package day_42_Map;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        map.forEach( (k,v) -> { System.out.println(k +" : "+ v); } );

        System.out.println("--------------------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
