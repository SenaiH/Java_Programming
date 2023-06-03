package trail_and_error;

public class IfReview {
public static String name;
static {
    name="heyo";
}

    public static void main(String[] args) {
        IfReview ifReview =  new IfReview();
        ifReview.name="yoyo";

        IfReview newIfre = new IfReview();
        newIfre.name = "nono";

        IfReview last = new IfReview();

        System.out.println(last.name);
        System.out.println(IfReview.name);
    }
}
