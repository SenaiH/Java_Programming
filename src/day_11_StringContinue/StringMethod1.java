package day_11_StringContinue;

public class StringMethod1 {
    public static void main(String[] args) {

       String str ="CYDEO SCHOOL" ;
       str = str.toLowerCase();

        System.out.println(str);

        System.out.println("-------------------------");

        String str1 = "java programming";
        str1=str1.toUpperCase();

        System.out.println(str1);

        System.out.println("------------------------------");

    String word = "Wooden Spoon";
    word = word.toUpperCase();
    word = word.toLowerCase();
        System.out.println(word);

        System.out.println("------------------------------");

        String str2 = "             Cydeo School";
        str2= str2.trim();
        System.out.println(str2);

        System.out.println("------------------------------");

     String sentence = "Today is Sunday, we have Java class";
     int index1 = sentence.indexOf('w');

        System.out.println(index1);

        String s1 = "I love java programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf("a ");

        System.out.println(secondA);

        System.out.println("------------------------------");

        String s2 = "Java Python JavaScript Cydeo python";
        int a1 = s2.indexOf('a');
         int a2 = s2.indexOf("a Python");

        System.out.println(a1);
        System.out.println(a2);

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);
        System.out.println("------------------------------");
        int a4 = s2.indexOf("aS"); // In order to get the 4th'a'.

        System.out.println(a3);
        System.out.println(a4);

        System.out.println("------------------------------");

        String w ="Java";
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

        System.out.println("------------------------------");

        String w1 = "Java Python JavaScript Python Cydeo";
        System.out.println(w1.lastIndexOf('a'));
        System.out.println(w1.lastIndexOf('P'));

    }

}
