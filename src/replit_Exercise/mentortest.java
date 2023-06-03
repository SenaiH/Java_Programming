package replit_Exercise;

public class mentortest {
    public static void main(String[] args) {

        String name = "    Chuk norris";
        name=name.trim();
        name = name.toUpperCase().charAt(0)+"."+name.toUpperCase().substring(name.indexOf(' ')+1,name.indexOf(' ')+2);

        System.out.println(name);
    }
}
