package day_19_Arrays;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {

        DecimalFormat df  = new DecimalFormat("0.00");
        double n1 = 10.567454;

        System.out.println(df.format(n1));
    }


}
