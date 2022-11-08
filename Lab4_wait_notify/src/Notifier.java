public class Notifier implements Runnable {

    private Message msg;
    
    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                //Set message and notify
                msg.setMsg("This is my message to be displayed");
                msg.notifyAll();
                //System.out.println(msg);

               
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}