package day_30_InheritanceContinue.deviceTask1;

public class MyDevices {
    public static void main(String[] args) {
        Blackberry bl = new Blackberry("AGT","45RT","Blue","Small",3000,true,false);
        PC pc = new PC("GRT","56H","Black","Small",200,true,true,"Dell");
        SmartTv tv = new SmartTv("Sony","GHT","Yellow","Large",450,false,true);

        System.out.println(bl);
        System.out.println(pc);
        System.out.println(tv);

        tv.channelUp();
        bl.turnOn();

        tv.turnOn();
    }

}
