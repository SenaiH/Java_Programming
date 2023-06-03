package day_27_StaticsAccessModifiers;

public class StaticBlock {
    public StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static{
        System.out.println("Static Block");
    }

}
