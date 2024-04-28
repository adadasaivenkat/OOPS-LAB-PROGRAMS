public class RunnableThread implements Runnable
{
    int no;
    RunnableThread(int no)
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
        RunnableThread obj1=new RunnableThread(2);
        RunnableThread obj2=new RunnableThread(3);
        Thread t1=new Thread(obj1);
        t1.start();
        Thread t2=new Thread(obj2);
        t2.start();
    }
}                                       