package day_30_InheritanceContinue.cryptoTask;

public class CryptoToken {
private double price,marketCap,volume,circulatingSupply;
private int quantity;
private boolean isMineable;

    public CryptoToken(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineable) {
        this.price = price;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.quantity = quantity;
        this.isMineable = isMineable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price");
            System.exit(1);
        }

        this.price = price;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap<=0){
            System.out.println("Invalid capital");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("Invalid quantity");
            System.exit(1);
        }

        this.quantity = quantity;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                '}';
    }
public double totalPrice(){
        return price*quantity;
}
}
/*
cryptoTask
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */