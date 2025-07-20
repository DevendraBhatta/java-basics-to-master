public class Account {
    private String account;
    private Double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;


    // getter and setter

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // custom method
    void depositFund(double amount) {
        balance += amount;
        System.out.println("Deposit of $"+amount+" Fund is Successful:");
        System.out.println(getAccount() + " account new balance : " + balance);
    }

    void withdrawFund(double amount) {
        if (balance -  amount < 0) {
            System.out.println("Withdraw is Unsuccessful");
            System.out.println(getAccount() + " account have  balance : " + balance);
            System.out.println("Sorry " + getCustomerName() + " You can't withdraw bigger amount than you account Balance ");
        } else {
            balance -= amount;
            System.out.println("Withdraw is Successful:");
            System.out.println(getAccount() + " account new balance : " + balance);
        }
    }

}
