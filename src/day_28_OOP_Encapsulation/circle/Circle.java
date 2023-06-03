package day_28_OOP_Encapsulation.circle;

public class Circle {

    private double radius ;

    public static double Pi;

    static {
        Pi = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Wrong Information");
            System.exit(1);
        }

        this.radius = radius;
    }
 public  double calcArea(){
     return radius*radius*Pi;
 }
public double perimeter(){
        return 2*Pi*radius;
}


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Pi=" + Pi +
                ", Area=" + calcArea() +
                ", Perimeter=" + perimeter() +
                '}';
    }
}
/*
Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement

 */