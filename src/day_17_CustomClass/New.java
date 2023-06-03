package day_17_CustomClass;

public class New {
    public static void main(String[] args) {
        String ta = "A";
        ta+="B";
        String tb = "C";
        ta+=tb;
        ta = ta.replace('C','D');
        System.out.println(ta);

    }

}
