package day_30_InheritanceContinue.deviceTask;

public class MyDevice {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("CRT","Black","Small",1000,true,true);
        Samsung samsung = new Samsung("ADT","Blue","Medium",7800,true,true);
        BlackBerry blackBerry = new BlackBerry("DGT","White","Large",7900,true,true);
        Google google = new Google("HGY","Yellow","Small",6900,true,true);
        Nokia nokia = new Nokia("GTR","Green","Medium",5000,true,false);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(blackBerry);
        System.out.println(google);
        System.out.println(nokia);

        iphone.turnOn();
        iphone.turnOff();
        iphone.call();

        samsung.call();
        samsung.text();


     PC pc = new PC("GTR","Black","Large",6000,false,true);
     DeskTop deskTop = new DeskTop("OHY","Blue","Large",4500,false,true);
     Laptop laptop = new Laptop("ADE","Black","Medium",6700,true,true);

        System.out.println(pc);
        System.out.println(deskTop);
        System.out.println(laptop);

        SmartTV tv = new SmartTV("GTR","Silver","Small",6500,false,true);

        System.out.println(tv);

        tv.channelUp();
        tv.channelDown();
    }

}

