package day_17_CustomClass;

public class AddressTest {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setInfo(6767,"Park Avenue","San Jose","CA",18987);
        System.out.println(address1);

        address1.address();
    }

}
