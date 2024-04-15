import java.lang.Math;
interface Shape
{
    // Interface fields are implicitly public, static, final, and abstract
    double area();
    double perimeter();
}
class Circle implements Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
class Rectangle implements Shape
{
    private double l,w;
    public Rectangle(double l, double w)
    {
        this.l=l;
        this.w=w;
    }
    public double area()
    {
        return l*w;
    }
    public double perimeter()
    {
        return 2*(l+w);
    }
}
public class PureAbs
{
    public static void main(String[] args)
    {
        // Shape shape =new Shape(); // Cannot instantiate the type Shape
        Circle o1=new Circle(5.894665);
        System.out.println("Area and perimeter of the circle is : "+o1.area()+" , "+o1.perimeter());
        Rectangle o2=new Rectangle(4.846, 6.846);
        System.out.println("Area and perimeter of the rectangle is : "+o2.area()+" , "+o2.perimeter());
    }
}