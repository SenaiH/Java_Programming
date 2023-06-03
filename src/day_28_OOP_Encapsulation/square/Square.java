package day_28_OOP_Encapsulation.square;

public class Square {
private int var;

    public Square(int var) {
        this.var = var;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        if(var<=0){
            System.err.println("Invalid Information");
            System.exit(1);
        }
        this.var = var;
    }
public double calcArea(){
        return var*var;
}
public double calcPerimeter(){
        return 4*var;
}

    @Override
    public String toString() {
        return "Square{" +
                "var=" + var +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*

2. Create a class named Square:
        Private variables:
            side

        Encapsulate all the fields

            Condition:
                side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.


        Methods:
            calcArea(): returns the area of square
            calcPerimeter(): returns the perimeter of square
            toString(): can display the side, area, perimeter of square when object is passed in print statement
 */