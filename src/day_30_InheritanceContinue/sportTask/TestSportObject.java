package day_30_InheritanceContinue.sportTask;

public class TestSportObject {
    public static void main(String[] args) {
        Baseball baseball = new Baseball(11,5,40);
        Basketball basketball = new Basketball(6,4,50);
        Americalfootball american = new Americalfootball(12,6,45);
        Football soccer = new Football(11,5,17);

        System.out.println(baseball);
        System.out.println(basketball);
        System.out.println(american);
        System.out.println(soccer);

        basketball.play();
        baseball.play();
        soccer.play();
        american.play();

    }

}
