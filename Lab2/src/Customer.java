public class Customer implements Runnable{

    private Account account;

    public Customer(Account account) {
        this.account=account;
    }

    @Override
    public void run()
    {
        for (int i=0; i<100; i++){
            account.addAmount(3000);
        }
    }
}
