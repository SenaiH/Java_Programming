package sample_Codes;

public class Multiply {
public static void myMultiply(int num1,int num2){
    int sum = 0;

    while (num1>0){
        num1--;
        sum+=num2;
    }
    System.out.println(sum);
}

    public static void main(String[] args) {
        myMultiply(2,4);
    }
}
/*
Write a function called myMultiply() which does not use the * operator. Instead it should use a
loop to do repeated addition instead. Remember: multiplication is just adding a number to itself
a given amount of times. For example myMultiply(5, 3) can be achieved by having a sum
variable and adding 5 to that sum 3 times.
 */