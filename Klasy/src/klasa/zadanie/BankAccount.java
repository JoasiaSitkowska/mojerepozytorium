package klasa.zadanie;

/**
 * Created by Asia on 2016-04-02.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerMail;
    private String customerPhoneNumber;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public  void depositFunds(double deposit){
        this.balance = this.balance + deposit;
        System.out.println("Stan konta po dodaniu srodkow wynosi: " + this.balance);
    }

    public void withdrawFunds(double withdraw){
        if (this.balance > withdraw) {
            this.balance = this.balance - withdraw;
            System.out.println("Stan konta po redukcji srodkow wynosi: " + this.balance);
        } else {
            System.out.println("Nie masz wystarczajaco srodkow na koncie");
        }
    }


}
