package day_11_StringContinue;

public class StringMethod2 {
    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language,Python is in high demand";
        sentence= sentence.replace("Python","Java");
        System.out.println(sentence);

        String word = "Java";
        word=word.replace('a','e');

        System.out.println(word);

        System.out.println("-----------------------");

        String sentence1 = "I love Java, Java is cool";
        //sentence1 = sentence1.replace("Java","Python");
       sentence1= sentence1.replaceFirst("Java","Python");
        System.out.println(sentence1);

        System.out.println("-----------------------");

        String sentence3="Java is fun, Java is cool,Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java"," Python"); //Replacing the second Java word(, space Java)

        System.out.println(sentence3);

        System.out.println("--------------------------");

        String sentence4 = "I love Java Programming";

        int sentence5 = sentence4.indexOf('J');
        System.out.println(sentence5);

        int sentence6 = sentence4.lastIndexOf("a ");
        System.out.println(sentence6);

       sentence4=sentence4.substring(7,10+1);

        System.out.println(sentence4);

        System.out.println("--------------------------");

        String today = "Today is Sunday, tomorrow is Monday ";

        int s1 = today.indexOf('S');
        int s2 = today.lastIndexOf("y,");

        System.out.println(s1);
        System.out.println(s2);

        String today1 = today.substring(9,14+1);
        System.out.println(today1);

        System.out.println("--------------------------");

        String email = "CydeoSchoolJavaProgramming@gmail.com";
      //  int email1 = email.indexOf("ya");
      //  int email2 = email.lastIndexOf("o.");

        int beginning = email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning,ending);

      //  System.out.println(email1);
      //  System.out.println(email2);
      // email = email.substring(27,31+1);
        //System.out.println(email);
        System.out.println(domain);

        System.out.println("--------------------------------");

        String sentence7 = "I love Java Programing";
       // sentence7 = sentence7.substring(7,sentence7.length()-1+1)
        sentence7 = sentence7.substring(7,sentence7.length());

        System.out.println(sentence7);

        System.out.println("--------------------------------");

        String sentence8 = "Today is Sunday, tomorrow is Monday";
        String tomorrow = sentence8.substring(sentence8.lastIndexOf(' ')+1);

        System.out.println(tomorrow);

        String school = "I study at Cydeo School";

        int school1 = school.indexOf('C');

        System.out.println(school1);

        school=school.substring(11);
        System.out.println(school);

        System.out.println("--------------------------------");

   String str = "Python";
   String result = (str +"\n").repeat(10);

        System.out.println(result);
    }

}
