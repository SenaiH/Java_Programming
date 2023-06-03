package day_8_ternary_and_switch;

public class Task_9_Browser {
    public static void main(String[] args) {
  String browserName ="opera";
  String result ="";

  switch (browserName){
      case "chrome":
          result = "chrome is valid";
          break;
      case "firefox":
          result = "firefox is valid";
          break;
      case "edge":
          result = "edge is valid";
          break;
      case "safari":
          result = "safari is valid";
          break;
      case "opera":
          result = "opera is valid";
          break;
      default:
          result = "INVALID!";

  }
        System.out.println(result);

    }

}
/*
write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */