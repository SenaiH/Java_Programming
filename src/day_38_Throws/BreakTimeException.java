package day_38_Throws;

public class BreakTimeException extends RuntimeException {
    public BreakTimeException(){
        super("It's break time");
    }

    public BreakTimeException(String message){
        super(message);
    }
}
