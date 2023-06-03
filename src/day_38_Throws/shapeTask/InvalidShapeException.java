package day_38_Throws.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }

}
