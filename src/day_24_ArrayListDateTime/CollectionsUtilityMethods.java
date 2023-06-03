package day_24_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i,"Python");
            }
        }
        System.out.println(names);

        System.out.println("----------------------------------");

        Collections.replaceAll(names,"Java","Python");

        System.out.println(names);

        System.out.println("----------------------------------");

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,20,30,40,50,50,50,50,50,50,60,70,70));

       int count =  Collections.frequency(list,50);

        System.out.println(count);

        System.out.println("-------------------------");
        ArrayList<String>words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));

        int count1 = Collections.frequency(words,"Java");

        System.out.println(count1);

        System.out.println("-------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,50,50,50,50,50,50,60,70,70));

        for (Integer each : numbers) {
            if(Collections.frequency(numbers,each)==1){
                System.out.println(each);
            }
        }


    }


}
