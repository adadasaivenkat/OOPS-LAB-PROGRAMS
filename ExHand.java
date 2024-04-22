public class ExHand
{
    public static void main(String[] args)
    {
        // ClassNotFoundException
        try
        {
            Class.forName("DoesNotExist");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found : "+e.getMessage());
        }
        // Unchecked
        // ArrayIndexOutOfBoundsException
        try
        {
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound : "+e.getMessage());
        }
        // NullPointerException
        try
        {
            String s=null;
            @SuppressWarnings("null")
            int l=s.length();
            System.out.println(l);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer : "+e.getMessage());
        }
        // ArithmeticException
        try
        {
            int temp=10/0;
            System.out.println(temp);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception : "+e.getMessage());
        }
    }
}