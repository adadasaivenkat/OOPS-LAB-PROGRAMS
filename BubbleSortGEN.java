import java.util.Scanner;
public class BubbleSortGEN<T extends Comparable<T>>
{
    void bs(T arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=read.nextInt();
        Integer arr[]=new Integer[n];   // Change the array type to Integer
        System.out.println("Enter "+n+" array elements :");
        for(int i=0; i<n; i++)
        {
            arr[i]=read.nextInt();
        }
        System.out.println("Before sorting array elements are : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        BubbleSortGEN<Integer> o1 = new BubbleSortGEN<>();
        o1.bs(arr);
        System.out.println("After sorting array elements are : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        Character[] arr2={'z','y','w','b','p','s','a'};
        BubbleSortGEN<Character> o2 = new BubbleSortGEN<>();
        o2.bs(arr2);
        System.out.println("Array elements are : ");
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
        read.close();
    }
}
