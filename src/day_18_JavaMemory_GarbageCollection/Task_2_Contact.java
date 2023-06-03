package day_18_JavaMemory_GarbageCollection;

public class Task_2_Contact {
    public String name = "";
    public int phoneNumber = 876655151;
    public String email = "senai@haile.com";

    public void setInfo(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Task_2_Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
 public void call(){
     System.out.println("Calling "+name+" now!");
 }
public void sendMessage(){
    System.out.println("Sending message to "+phoneNumber+ " now!");
}
public void sendEmail(){
    System.out.println("Sendnd email to "+email+" now!");
}

    public static void main(String[] args) {

        Task_2_Contact contact1 = new Task_2_Contact();
        contact1.setInfo("Senai",54642323,"senai@gmail.com");
        System.out.println(contact1);

        contact1.call();
        contact1.sendMessage();
        contact1.sendEmail();
    }


}
/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */