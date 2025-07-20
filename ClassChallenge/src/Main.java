public class Main {
    public static void main(String[] args) {
//        Account account = new Account("Devendra","bhattadevendra60@gmail.com","9848461490",3000,"9870000545454");

        Account account = new Account();
        System.out.println(account.getCustomerName());
        System.out.println(account.getCustomerPhone());

        account.depositFund(2000);
        account.withdrawFund(7000);
        account.withdrawFund(1000);

        Account timAccount = new Account("Omi","omi123@gmail.com","985585965");
        System.out.println("Account No"+timAccount.getAccountNumber()+" name"+timAccount.getCustomerName());
        timAccount.depositFund(500);
        timAccount.withdrawFund(1000);
    }
}
