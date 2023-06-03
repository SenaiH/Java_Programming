package day_28_OOP_Encapsulation.credential;

public class TestCredentialObjects {
    public static void main(String[] args) {

        Credentials paswd1 = new Credentials("Senai","5gtshFG@#");

        System.out.println(paswd1);

        paswd1.setPassword("hjhfjsjkdgr5Aa@");
        System.out.println(paswd1.getPassword());
    }

}
