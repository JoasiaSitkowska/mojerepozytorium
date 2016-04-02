package klasa.zadanie;

/**
 * Created by Asia on 2016-04-02.
 */
public class Main {

    public static void main(String[] args){

        BankAccount account1 = new BankAccount();

        account1.setAccountNumber("9876543210");
        System.out.println("Number of account is: " + account1.getAccountNumber());

        account1.setBalance(10623.50);
        System.out.println("Balance of account is: " + account1.getBalance());

        account1.setCustomerName("Bolek");
        System.out.println("Name of customer is: " + account1.getCustomerName());

        account1.setCustomerMail("bolek@account.com");
        System.out.println("Mail of customer is: " + account1.getCustomerMail());

        account1.setCustomerPhoneNumber("123456789");
        System.out.println("Phone numer of customer is: " + account1.getCustomerName());

        account1.depositFunds(2000);
        account1.withdrawFunds(14555);




    }
}
