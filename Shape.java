public class Shape
{
    public static void main(String[] args) 
    {   
        //import values from class Rectangle.java to calculate rectangle area
        Rectangle rect = new Rectangle();
        rect.rectDimensio(10, 20);
        rect.rectArea();
        //import values from class Circle.java to calculate circle area
        Circle cir = new Circle();
        cir.cirDimension(10);
        cir.cirArea();

    }
}
