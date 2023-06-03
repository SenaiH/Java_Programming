package day_30_InheritanceContinue.cryptoTask;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin(500,0.5,690,4,100,true);
        Cardano cardano = new Cardano(100,0.2,300,1,10,false);
        Doge doge = new Doge(200,0.3,400,5,30,true);
        Ethereum ethereum = new Ethereum(400,0.3,400,6,40,true);
        XRP xrp = new XRP(150,0.1,200,1,20,false);

        System.out.println(bitcoin);
        System.out.println(cardano);
        System.out.println(doge);
        System.out.println(ethereum);
        System.out.println(xrp);

        System.out.println(bitcoin.totalPrice());
        System.out.println(cardano.totalPrice());
        System.out.println(doge.totalPrice());
        System.out.println(ethereum.totalPrice());
        System.out.println(xrp.totalPrice());

    }
}
