public class WaitNotifyTest {

    public static void main(String[] args) {
        // Create a Message(), two Waiters(msg), and a Notifier(msg)
        Message m = new Message("Message");
    	//Start Waiters and Notifier
        Waiter waiter = new Waiter(m);
        Waiter waiter1 = new Waiter(m);
        Notifier notifier = new Notifier(m);
        new Thread(waiter,"Waiter").start();
        new Thread(waiter1,"Waiter1").start();
        new Thread(notifier,"Notifier").start();
    	// Print message "All the threads are started"
        System.out.println("All threads have been notified");
    	
    
    }

}
