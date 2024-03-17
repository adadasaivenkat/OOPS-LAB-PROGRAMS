class Add2Int
{
    int add(int n1,int n2)
    {
        return (n1+n2);
    }
}
class Add3Int extends Add2Int
{
    int add(int n1,int n2,int n3)
    {
        return (n1+n2+n3);
    }
}
public class MethodOLInheri
{
    public static void main(String[] args)
    {
        Add3Int obj=new Add3Int();
        System.out.println("Addition of 2 numbers is : "+obj.add(5,6));
        System.out.println("Addition of 3 numbers is : "+obj.add(5,6,7));
    }
}