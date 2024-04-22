import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy
{
    public static void main(String[] args)
    {
        int temp;
        try(FileInputStream obj1=new FileInputStream("src.txt");
            FileOutputStream obj2=new FileOutputStream("dest.txt");)
        {
            while((temp=obj1.read())!=-1)
            {
                obj2.write(temp);
            }
            System.out.println("Successfully Copied!");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found : "+e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error copying file : "+e.getMessage());
        }
    }
}