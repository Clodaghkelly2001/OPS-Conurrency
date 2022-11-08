import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Main {

    public static void main(String[] args) {
    	
    	// Create a new LinkedBlockingQueue size 10 
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(10) ;
        //Start Producer and Consumer threads
        Producer p1 = new Producer(queue);
        Consumer c1 = new Consumer(queue);

        new Thread(p1, "p1").start();
        new Thread(c1, "c1").start();

        

    }

}