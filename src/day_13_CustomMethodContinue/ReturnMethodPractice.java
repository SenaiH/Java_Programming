package day_13_CustomMethodContinue;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        boolean num = isOdd(3);
        System.out.println(num);

        System.out.println("------------");
        boolean num1 = isEven(6);
        System.out.println(num1);

        System.out.println("------------");
        int Max = max(2,4);
        System.out.println(Max);
        int Max1 = max(6,2);
        System.out.println(Max1);

        System.out.println("------------");
        int Min = min(2,4);
        System.out.println(Min);
        int Min1 = min(6,2);
        System.out.println(Min1);
    }

    public static boolean isOdd(int num) {
        boolean result = (num % 2 != 0) ? true : false;
        return result;
    }

    public static boolean isEven(int num) {
        // return !isOdd(num)
        boolean result1 = (num % 2 == 0) ? true : false;
        return result1;
    }
public static int max(int a,int b){
        int max =(a>b)? a: b;
        return max;
}
    public static int min(int a,int b) {
        int min = (a < b) ? a : b;
        return min;
    }
}
/*
1 Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false
3. Create a method named max, that can return the maximum number between two numbers
4. Create a method named min, that can return the minimum number between two numbers

 */