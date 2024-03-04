class Animal
{ 
    public void eat()
    {
        System.out.println("I can eat.");
    }
    public void sleep()
    {
        System.out.println("I can sleep.");
    }
}
class Dog extends Animal
{
    public String name="Puppy";
    public void display()
    {
        System.out.println("My name is "+name+".");
    }
    public void bark()
    {
        System.out.println("I can bark.");
    }
}
public class SimpleInheri
{
    public static void main(String[] args)
    {
        Dog Puppy=new Dog();
        Puppy.display();      // Specific to Dog
        Puppy.eat();          // Inherited from Animal
        Puppy.sleep();        // Inherited from Animal
        Puppy.bark();         // Specific to Dog
    }
}