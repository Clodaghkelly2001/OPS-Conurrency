public class count extends Thread
{
    int delay;
    public count(String str,int delay)
    {
        super(str);
        this.delay = delay;
    }

    public void run()
    {

        //print string 10 times
        for(int i = 0; i <= 5; i++ )
        {
            System.out.println(i  + "  " + getName());

            try
            {
                sleep(delay);
                if(getName() == "I HATE THREADS" && i ==3)
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
        new count("WHY DO THREADS EXIST", 1000).start();
        new count("I HATE THREADS",500).start();
    }

}
