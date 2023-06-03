package day_39_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);


        System.out.println("------------------------------------------------------------");


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);


        System.out.println("------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        //System.out.println(lastElement);
        System.out.println(stack);

        stack.pop();
        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);

       // System.out.println(stack);

        ArrayList<Integer>list5 = new ArrayList<>(); // get method is fast
        LinkedList<Integer>list6 = new LinkedList<>();
        Vector<Integer>list7 = new Vector<>();
        Stack<Integer>list8 = new Stack<>();

        list5.add(200);
        list5.add(400);

        list5.remove(0);

        System.out.println(list5);

        System.out.println("-------------------------");

        list6.add(200);
        list6.add(400);

        list6.remove(0);

        System.out.println(list6);

        System.out.println("-------------------------");
        list7.add(200);
        list7.add(400);

        list7.remove(0);

        System.out.println(list7);

        System.out.println("-------------------------");
        list8.add(200);
        list8.add(400);

        list8.pop();

       // list8.remove(0);

        System.out.println(list8);

        System.out.println("-------------------------");

    }
}
