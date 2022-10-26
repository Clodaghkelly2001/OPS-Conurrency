public class SimpleThread  extends Thread
{
    //create object
    public SimpleThread(String str)
    {
        //receive string input
        super(str);
    }


    public void run()
    {
        //print string 10 times
        for(int i = 0; i <= 10; i++ )
        {
            System.out.println(i + " " +getName());
        }

        try
        {
            sleep(1000);
        }

        catch (InterruptedException e)
        {

        }
        System.out.println("Final thread: ");
    }

    public static void main(String[] args)
    {
        new SimpleThread("Dog").start();
        new SimpleThread("Cat").start();
        new SimpleThread("Fish").start();
    }
}
