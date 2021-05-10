package LabOne;

public class Account {
	private        int    _id;
	private        double _balance;
	private static double annualInterestRate;


	//region getter & setter
	public int getId() {
		return _id;
	}

	public void setId(int _id) {
		this._id = _id;
	}

	public double getBalance() {
		return _balance;
	}


	private void setBalance(double _balance) throws AccountException {
		if(_balance > 0) {
			this._balance = _balance;
		}else{
			throw new AccountException("Balance can not be negative!",AccountExceptionType.FUND_INSUFFICIENCY);
		}
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate * .01;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	//endregion

	//region constructor
	Account(){

	}

	Account(int id,double balance){
		this._id = id;
		this._balance =balance;
	}
	//endregion

	/**
	 * @return 月利息
	 */
	public double getMonthlyInterest(){
		return _balance * (Account.getAnnualInterestRate() / 12);
	}

	public void withdraw(double money){
		try {
			this.setBalance(this.getBalance() - money);
		}
		catch (AccountException e) {
			e.printStackTrace();
		}
	}

	public void deposit(double money){
		try {
			this.setBalance(this.getBalance() + money);
		}
		catch (AccountException e) {
			e.printStackTrace();
		}
	}
}
