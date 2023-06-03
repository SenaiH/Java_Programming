package day_26_ConstruChainingStatics;

import java.sql.SQLOutput;

public class TestEmployee1Object {
    public static void main(String[] args) {

        Employee1 empl1 = new Employee1("Senai");

        System.out.println(empl1);

        Employee1 empl2 = new Employee1("Senait",'F');

        System.out.println(empl2);


        Employee1 empl3 = new Employee1("Salem",'F',"Engineer");

        System.out.println(empl3);

        Employee1 empl4 = new Employee1("Daniel",'M',"Truck Operator",100_000);

        System.out.println(empl4);

        Employee1 empl5 = new Employee1("Abraham",'n',"Engineer",250_000);

        System.out.println(empl5);

        Employee1 empl6 = new Employee1("",'n',"Architect",140_000);

        System.out.println(empl6);

    }


}
