package day_11_StringContinue;

public class StringMethod3 {
    public static void main(String[] args) {

        String word = "Java";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        String str = "      ";
        boolean r2 = str.isEmpty();  // or if the last index is "0' it is Empty.
        boolean r3 = str.isBlank();

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        String str3 = "cydeo";

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println("------------------------");

        String s1 = "Java";
        String s2 = "JAVA";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("------------------------");

        String students = "mussa Simon Daniel Ahmed";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println(hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println(hasJava);

        boolean hasJava1 = sentence.toLowerCase().contains("java");
        System.out.println(hasJava1);

        boolean hasJava2 = sentence.toUpperCase().contains("JAVA");
        System.out.println(hasJava2);

        System.out.println("------------------------");

        String name = "Michael";
        boolean l = name.startsWith("DA");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean start = url.startsWith("www.");
        boolean end = url.endsWith(".com");

        System.out.println(start);
        System.out.println(end);

        System.out.println("------------------------");

        String email = "www.cydeo@gmail.com";
        boolean isGmail = email.contains("gmail");
        boolean isYahoo = email.contains("yahoo");
        boolean isHotmail = email.contains("hotmail");

        System.out.println(isGmail);
        System.out.println(isHotmail);
        System.out.println(isYahoo);

    }

}
