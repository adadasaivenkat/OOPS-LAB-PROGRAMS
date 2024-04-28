public class ThreadClass extends Thread
{
    int no;
    ThreadClass(int no)
    {
        this.no=no;
    }
    public void run()
    {
        multiply();
    }
    public void multiply()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+no+" * "+i+" = "+(no*i));
            try
            {
                Thread.sleep(30);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" have finished execution.");
    }
    public static void main(String[] args)
    {
        ThreadClass obj1=new ThreadClass(2);
        ThreadClass obj2=new ThreadClass(3);
        obj1.start();
        obj2.start();
    }
}