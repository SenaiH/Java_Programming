package day_30_InheritanceContinue.cryptoTask;

public class Bitcoin extends CryptoToken {
    public Bitcoin(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }
}
