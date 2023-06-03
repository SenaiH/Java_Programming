package Week1_Java_Coding;

public class MultiplyWithOutOperator {
public static void multiply(int num1,int num2){

    int sum = 0;

    while (num1>0){
        num1--;
        sum+=num2;
    }
    System.out.println(sum);
}

    public static void main(String[] args) {
        multiply(2,3);
    }
}
