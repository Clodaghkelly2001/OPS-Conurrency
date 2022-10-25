public class countRunnable  implements Runnable
{
    int delay;
    String name;

    public countRunnable(String name,int delay)
    {
        this.name = name;
        this.delay = delay;
    }

    public void run()
    {

        //print string 10 times
        for(int i = 0; i <= 5; i++ )
        {
            System.out.println(i  + "  " + name);

            try
            {
                count.sleep(delay);
                if(name == "I HATE THREADS" && i ==3)
                {
                    throw new InterruptedException();
                }
            }
            catch (InterruptedException e) {
                System.out.println("I HATE THREADS EXCEPTION");
            }
        }
    }
    public static void main(String[] args)
    {
        new countRunnable("WHY DO THREADS EXIST", 1000).start();
        new countRunnable("I HATE THREADS",500).start();
    }
}
