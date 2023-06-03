package day_30_InheritanceContinue.cryptoTask;

public class Cardano extends CryptoToken {
    public Cardano(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }
}
