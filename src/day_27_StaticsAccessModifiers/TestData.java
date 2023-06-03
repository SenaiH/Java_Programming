package day_27_StaticsAccessModifiers;
import day_27_StaticsAccessModifiers.Data;
public class TestData {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

    Data.method4();
    Data.method3();

    Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

    }
}