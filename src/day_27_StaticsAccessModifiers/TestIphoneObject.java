package day_27_StaticsAccessModifiers;

public class TestIphoneObject {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("XLTR",'L',"Black","2023ret",10_000);

        System.out.println(iphone);

        System.out.println(Iphone.madeIn);

        iphone.printOperatingSystem();

        iphone.call(27385456328l);
        iphone.text(45649876l);
        iphone.faceTime(78654345l);
        iphone.faceTime("www.noemail.com");

    }

}
