public class YourThread extends Thread
{
    int delay;
    //create object
    public YourThread(String str,int delay)
    {
        //receive string input
        super(str);
        this.delay = delay;
    }


    public void run()
    {
    long startTime = System.nanoTime();
        for(int i = 0; i <= 10; i++ )
        {
            System.out.println(i + " " +getName());
        }

        try
        {
            sleep(1000);
        }
        catch (InterruptedException e){}

        long elapsedTime = System.nanoTime() - startTime;
        float roundedTime = (elapsedTime/1000000000);
        System.out.println("Final Thread Complete: " + "Elapsed Time: " + roundedTime);
        System.out.println(delay);
    }

    public static void main(String[] args)
    {
        new YourThread("Dog", 2000).start();
        new YourThread("Cat", 1000).start();

    }
}
