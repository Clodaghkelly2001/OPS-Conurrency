
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    synchronized private void process() throws InterruptedException {

        // Put 20 ints into Queue and sleep for 100ms
        for(int i = 0; i <= 20; i++){
            System.out.println("[PRODUCER] put: "+i);
            queue.put(i);
            System.out.println("[PRODUCER] Queue remaining capacity: "+queue.remainingCapacity());
            Thread.sleep(100);
        }


    }

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}