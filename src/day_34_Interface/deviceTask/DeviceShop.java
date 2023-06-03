package day_34_Interface.deviceTask;

public class DeviceShop {
    public static void main(String[] args) {
        Computer computer = new Computer("JVC","FDGT","Blue",1200,'S',false,true);
        DeskTop deskTop = new DeskTop("Dell","GFT","Yellow",230,'L',true,true);
        Google google = new Google("Google","ght","Black",400,'M',true,true);
        Iphone iphone = new Iphone("Iphone","GHT","Green",300,'A',true,true);
        Laptop laptop = new Laptop("Lenovo","HT","Silver",600,'M',true,false);
        PC pc =new PC("Sony","tgo","Blue",290,'L',false,true);
        Phone phone = new Phone("BlackBerry","jku","white",450,'S',true,true);
        Samsung samsung = new Samsung("Samsung","ght","White",670,'L',true,false);

        System.out.println(computer);
        System.out.println(deskTop);
        System.out.println(google);
        System.out.println(iphone);
        System.out.println(laptop);
        System.out.println(pc);
        System.out.println(phone);
        System.out.println(samsung);

        System.out.println("---------------------------------------------");

        computer.turnOn();
        deskTop.turnOff();
        google.downloadApp();
        phone.call(676888999);
        iphone.downloadApp();
        laptop.turnOn();
        pc.turnOff();
        phone.text(88987678);
        samsung.downloadApp();

    }
}
