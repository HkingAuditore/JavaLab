package LabOne.Account;

public class AccountTest {
    public static void main(String[] args) {
        try {
            Account account = new Account(95588, 20000);
            Account.setAnnualInterestRate(0.3);
            account.withdraw(2500);
            account.deposit(3000);
            System.out.println("Balance is " + account.getBalance());
            System.out.println("Monthly interest is " + account.getMonthlyInterest());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
