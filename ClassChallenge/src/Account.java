public class Account {
    private String accountNumber;
    private Double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // constructor
    public Account() {
        this("Bikrant","bikrant123@gmail.com","9811165532",4567,"9840000254689");
        System.out.println("Empty Constructor is called");
    }

    public Account(String customerName, String customerEmail, String customerPhone, double balance,String accountNumber) {
        System.out.println("Account Constructor with parameter called");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this(customerName,customerEmail,customerPhone,1000,"987000012333415");
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    // getter and setter

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // custom method
    void depositFund(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " Fund is Successful:");
        System.out.println(getCustomerName() + " account new balance : " + balance);
    }

    void withdrawFund(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw is Unsuccessful");
            System.out.println(getCustomerName() + " account have  balance : " + balance);
            System.out.println("Sorry " + getCustomerName() + " You can't withdraw bigger amount than you account Balance ");
        } else {
            balance -= amount;
            System.out.println("Withdraw is Successful:");
            System.out.println(getCustomerName() + " Remaining Balance : " + balance);
        }
    }

}
