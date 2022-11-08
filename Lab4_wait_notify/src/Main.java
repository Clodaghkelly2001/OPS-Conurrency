import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) {

        // Create a new LinkedBlockingQueue size 10
        BlockingDeque<Integer> queue = new LinkedBlockingDeque<>(10);


        //Start Producer and Consumer threads
        Producer p1 = new Producer(queue);
        Consumer c1 = new Consumer(queue);

        new Thread (p1,"p1").start();
        new Thread (c1,"c1").start();
    }

}