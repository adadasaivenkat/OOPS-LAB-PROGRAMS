public class ThreadSync extends Thread
{
    int no;
    private static final Object lock = new Object();
    ThreadSync(int no)
    {
        this.no=no;
    }
    public void run()
    {
        multiply();
    }
    public void multiply()
    {
        synchronized(lock)
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
    }
    public static void main(String[] args)
    {
        ThreadSync obj1 = new ThreadSync(2);
        ThreadSync obj2 = new ThreadSync(3);
        obj1.start();
        obj2.start();
    }
}