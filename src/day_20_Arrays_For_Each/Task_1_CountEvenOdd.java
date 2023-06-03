package day_20_Arrays_For_Each;

public class Task_1_CountEvenOdd {
    public static void main(String[] args) {

        int[]num = {1,2,3,4,5,6,7,8,9,10,11,12,14,13};
        int countEven = 0;
        int countOdd = 0;

        for (int each : num) {
            if(each%2==0){
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);
        
    }


}
/*
Write a program that can count the even and odd number from an array of integers 

			Note: MUST use for each loop
 */