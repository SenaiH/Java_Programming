package day_04_Concatenation;

public class Task6_Circle {
    public static void main(String[] args) {
       int radius = 5;
       double area =Math.round(Math.PI*(radius*radius)) ;
       double perimeter=Math.round(2*Math.PI*radius);
        System.out.println("Area of a circle is: "+area+"\nPerimeter of a Circle is: "+perimeter);
    }

}
/*
Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */