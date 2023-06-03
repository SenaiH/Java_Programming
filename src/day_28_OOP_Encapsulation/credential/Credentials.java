package day_28_OOP_Encapsulation.credential;

public class Credentials {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)){
            System.err.println("Your password must contain at least one letter, one digit and one special character ");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassword(String password) {
        if (password.length() < 8 || password.contains(" ")) {
            System.err.println("Your password is to short. Please provide new password again");
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (Character each : password.toCharArray()) {
            if (Character.isLetter(each)) {
                hasLetter = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecialCharacter = true;
            }
        }
        if (hasDigit && hasLetter && hasSpecialCharacter) {
            return true;
        } else {
            return false;
        }
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "username: '" + getUsername() + '\'' +
                ", password: '" +getPassword() + '\'' +
                '}';
    }
}
/*create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */