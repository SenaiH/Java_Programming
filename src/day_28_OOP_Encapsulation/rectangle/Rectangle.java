package day_28_OOP_Encapsulation.rectangle;

public class Rectangle {

    private int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<=0){
            System.err.println("Wrong length number");
            System.exit(1);
        }

        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<=0){
            System.err.println("Wrong width number");
            System.exit(1);
        }

        this.width = width;
    }
public double calcArea(){
        return length*width;
}
 public double calcPerimeter(){
        return (2*length) +(2*width);
 }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */