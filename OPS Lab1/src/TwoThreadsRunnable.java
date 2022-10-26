public class TwoThreadsRunnable
{

    public static void main(String[] args)
    {

        Runnable s1 = new SimpleThread("Jamaica");
        Thread t1 = new Thread(s1);
        Runnable s2 = new SimpleThread("fiji");
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();

    }

}
