package replit_Exercise;

 class Employee {
    public static void main(String[] args) {

     isEven(7);


    }
    public static void isEven(int num){

       boolean isEven=true;
        isEven=(num%2==0)?true:false;
        boolean isOdd=true;
        isOdd = (num%2!=0)?true:false;

        System.out.println(isEven);
        System.out.println(isOdd);
    }

}
/*
Finish the method called `isEven()` that will take an `int`argument and return if the given number is even as a `boolean`. If the number is even the method returns `true`, but if the number is odd the method returns `false`. The `isEven()` method is being called in the main method and given an argument.

#### This is a `return` method with an `int` parameter

Main topics: methods, Scanner, primitive datatypes, operators, if statements

Example:
```
  isEven(4)

output:
  true
 */