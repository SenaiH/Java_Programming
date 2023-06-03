package day_39_Collections;

import java.util.*;

public class Trial {
    public static void main(String[] args) {
        String str[] = {"AAABBBCCCDDD"};
        ArrayList<String>list = new ArrayList<>(Arrays.asList(str));
        HashSet<String>list1 = new HashSet<>(Arrays.asList(str));
        TreeSet<String>list2 = new TreeSet<>(Arrays.asList(str));

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words) );

        System.out.println(result);

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));

        queue1.poll(); //FIFO

        System.out.println(queue1);

        Stack<Integer> vector1 = new Stack<>(); // order is random, does not accept null
        vector1.addAll(Arrays.asList(10, 200, 300, 40, 90));

        vector1.pop(); //LIFO

        System.out.println(vector1);



    }

}
