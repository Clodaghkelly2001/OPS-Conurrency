public class TwoThreads
{
    public static void main(String[] args)
    {

        Thread t1 = new SimpleThread("Jamaica");
        t1.start();
        Thread t2 = new SimpleThread("fiji");
        t2.start();

    }
}
