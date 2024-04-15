import java.lang.Math;
abstract class Shape
{
    abstract double area();
    abstract double perimeter();
    void displayType()
    {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return Math.PI * radius * radius;
    }
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape
{
    private double l, w;
    public Rectangle(double l, double w) 
    {
        this.l = l;
        this.w = w;
    }
    public double area()
    {
        return l * w;
    }
    public double perimeter()
    {
        return 2 * (l + w);
    }
}
public class ParAbs
{
    public static void main(String[] args)
    {
        // Shape shape =new Shape(); // Cannot instantiate the type Shape
        Circle o1 = new Circle(5.894665);
        o1.displayType();
        System.out.println("Area and perimeter of the circle is : " + o1.area() + " , " + o1.perimeter());
        Rectangle o2 = new Rectangle(4.846, 6.846);
        o2.displayType();
        System.out.println("Area and perimeter of the rectangle is : " + o2.area() + " , " + o2.perimeter());
    }
}