package LabOne;

public class Account {
    private static double annualInterestRate;
    private int _id;
    private double _balance;


    //region constructor
    Account() {

    }

    Account(int id, double balance) {
        this._id = id;
        this._balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate * .01;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    //region getter & setter
    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    //endregion

    public double getBalance() {
        return _balance;
    }

    private void setBalance(double _balance) throws AccountException {
        if (_balance > 0) {
            this._balance = _balance;
        } else {
            throw new AccountException("账户不允许透支！", AccountExceptionType.FUND_INSUFFICIENCY);
        }
    }
    //endregion

    /**
     * @return 月利息
     */
    public double getMonthlyInterest() {
        return _balance * (Account.getAnnualInterestRate() / 12);
    }

    public void withdraw(double money) throws AccountException {
        this.setBalance(this.getBalance() - money);
    }

    public void deposit(double money) {
        try {
            this.setBalance(this.getBalance() + money);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }
}
