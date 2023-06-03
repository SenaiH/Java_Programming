package day_20_Arrays_For_Each;

public class Task_3_CountPalindrome {
    public static void main(String[] args) {
        String[] arr = {"level", "new", "java", "radar"};
        int count = 0;
        for (String each : arr) {
            String reversed ="";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reversed)){
                count++;
            }
        }
        System.out.println(count);
    }

}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */