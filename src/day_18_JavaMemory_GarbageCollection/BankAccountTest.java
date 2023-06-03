package day_18_JavaMemory_GarbageCollection;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount object1 = new BankAccount();
        object1.setInfo("Senai",2635454);
        System.out.println(object1);
        object1.deposit(4500);
        object1.checkBalance();
        object1.withdraw(2000);
        object1.checkBalance();
        System.out.println("-------------------------");
        BankAccount object2 = new BankAccount();
        System.out.println(object2);
        object2.setInfo("Haile",786543);
        object2.deposit(2334);
        object2.withdraw(1987);
        object2.checkBalance();

        System.out.println("----------------------------------");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Sebastian",1234565);
        account2.setInfo("Abel",3452432);

        account2.deposit(5000);
        account1.deposit(10000);
        System.out.println("----------------------------------");
        System.out.println(account2);
        System.out.println(account1);
        System.out.println("----------------------------------");
        account1.withdraw(1000);
        System.out.println("----------------------------------");
        System.out.println(account1);
        System.out.println(account2);

    }

}
