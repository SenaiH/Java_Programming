package day_29_Inheritance.phoneTask;

public class Iphone extends Telephone  {

    public void faceTime(long phoneNumber){
        System.out.println("we can talk on facetime on this "+phoneNumber+" number");
    }
  public void faceTime(String email){
      System.out.println("You can reach me with this email address "+ email);
  }
}
