package Week1_Java_Coding;

public class MultiplyString {
public static void multiplyString(String str, int num){

    String newString = "";
    while (num>0){
        num--;
    newString+=str;
    }
    System.out.println(newString);
}

    public static void main(String[] args) {
        multiplyString("Hello",5);
    }
}
