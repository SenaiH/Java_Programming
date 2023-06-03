package day_29_Inheritance.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {
      Iphone iphone = new Iphone();
      iphone.setInfo("Apple","XVR45","Blue",13_000,'M');
        System.out.println(iphone);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","GHTF46","Black",5_000,'L');
        System.out.println(samsung);

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","GTR54","Red",10_000,'S');
        System.out.println(nokia);

    iphone.faceTime("david@gmail.com");
    iphone.faceTime(56567527);
    iphone.call(987676);

    samsung.freeze();
    samsung.call(89755446);

    nokia.selfDefence();
    nokia.call(98775578);

    iphone.text(876445);
    samsung.text(54354);
    nokia.text(654576);
    }
}
