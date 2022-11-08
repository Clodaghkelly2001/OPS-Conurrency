public class SimpleThreadRunnable implements Runnable
{
    String name;
    int delay;

    //constructor to create thread object
    public SimpleThreadRunnable(String name, int delay)
    {
        this.name = name;
        this.delay = delay;
    }


    @Override
    public void run()
    {

        //print string 10 times
        for(int i = 0; i <= 10; i++ )
        {
            System.out.println(i + " " + name);
        }

        //delay for 1000ms
        try
        {
            SimpleThread.sleep(1000);
        }

        catch (InterruptedException e)
        {

        }

        //print message at the end to identify final print
        System.out.println("thread complete");
    }

    public static void main(String[] args)
    {
        new SimpleThreadRunnable("Dog", 500).run();
        new SimpleThreadRunnable("Cat",1000).run();
        new SimpleThreadRunnable("Fish",1500).run();
    }

}
