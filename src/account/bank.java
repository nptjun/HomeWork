package account;

public class bank {
    public static void main(String[] args) {
        Account account=new Account();
        Customer customer=new Customer();
        account.cid=12345678;
        account.balance=1000.0;
        account.Customername="张三";
        account.getinfo();
        customer.say();
        account.withdraw();
    }
}
