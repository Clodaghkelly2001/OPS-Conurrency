public class YourThreadRunnable implements Runnable
{
    String name;
    int delay;

    //constructor to create thread object
    public YourThreadRunnable(String name, int delay)
    {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run()
    {
        long startTime = System.nanoTime();

        for(int i = 0; i <= 10; i++ )
        {
            System.out.println(i + " " + name);
        }
        try
        {
            YourThread.sleep(1000);
            System.out.println(delay);
        }
        catch (InterruptedException e) {}

        long elapsedTime = System.nanoTime() - startTime;
        float roundedTime = (elapsedTime/1000000000);
        System.out.println("Final Thread Complete: " + "Elapsed Time: " + roundedTime);
        System.out.println(delay);
    }

    public static void main(String[] args)
    {
        new SimpleThreadRunnable("Dog", 500).run();
        new SimpleThreadRunnable("Cat",1000).run();
        new SimpleThreadRunnable("Fish",1500).run();
    }
}
