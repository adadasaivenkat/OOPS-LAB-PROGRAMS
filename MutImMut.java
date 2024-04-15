class Mut
{
    private String name="Sai Venkat Adada";
    private int age=18;
    public Mut(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
class ImMut
{
    private final String name="Sai Venkat Adada";
    private final int age=18;
    public ImMut(String name, int age)
    {
        /*
        this.name=name; // ERROR The final field ImMut.name cannot be assigned i.e., String name
        this.age=age;   // ERROR The final field ImMut.age cannot be assigned i.e., int age
        */
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class MutImMut
{
    public static void main(String[] args)
    {
        //Mutable Object
        System.out.println("Example of Mutable Object");
        Mut obj1=new Mut("Surya Kumari Adada",46);
        System.out.println("Name is : "+obj1.getName());
        System.out.println("Age is : " + obj1.getAge());

        StringBuilder obj2=new StringBuilder("Coding");
        obj2.append(" ");
        obj2.append("is Fun!!");
        System.out.println("By StringBuilder class : "+obj2);

        //Immutable Object
        System.out.println("Example of Immutable Object");
        ImMut obj3 = new ImMut("JAVA",29);
        System.out.println("Name is : " + obj3.getName());
        System.out.println("Age is : " + obj3.getAge());
    }
}