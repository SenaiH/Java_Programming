package day_14_forLoop;

public class day14_WarmUpTask {

    public static String combine(String str1,String str2){

        String result;

        if(str1.endsWith(""+ str2.charAt(0))){      // we added double quotation to convert the char to string.
            result=str1+str2.substring(1);
        }else {
            result=str1+str2;
        }
        return  result;
    }
    public static int sumOf2Integers(int num1,int num2){
        int result1= num1+num2;

        return  result1;
    }public static int sumOf3Integers(int num1,int num2,int num3){
        //return sumOf2Integers(num1,num2)+num3;
        int result2=num1+num2+num3;
        return  result2;

    }public static int sumOf4Integers(int num1,int num2,int num3,int num4){
        //return sumOf3Integers(num1,num2,num3)+num4;
        //return sumOf2Integers(num1,num2)+sumOf2Integers(num3,num4)
        int result3=num1+num2+num3+num4;
        return result3;
    }

    public static void main(String[] args) {
        String str3 = combine("one","eight");
        System.out.println(str3);

        System.out.println("-------------------------------------");
       int int1 = sumOf2Integers(10,30);
       int int2 = sumOf3Integers(10,20,30);
       int int3 = sumOf4Integers(10,20,30,40);

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);



      // String s1 = "" +'A' ;=====> "A";
      // String s2 = true +"";======>"true";

    }

}
/*
Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

 */