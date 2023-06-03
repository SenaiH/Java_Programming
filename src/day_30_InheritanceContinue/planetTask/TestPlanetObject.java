package day_30_InheritanceContinue.planetTask;

public class TestPlanetObject {
    public static void main(String[] args) {
        Earth earth = new Earth(400.00,678,20098,67543,654323,8500000000L);
        Mercury mercury = new Mercury(300,567,78965,87543,9087,0);
        Moon moon = new Moon(458,78654,7865,65463,9087,0);
        Venus venus = new Venus(6758,32454,6545,85410,35626,0);

        System.out.println(earth);
        System.out.println(mercury);
        System.out.println(moon);
        System.out.println(venus);

    }

}
