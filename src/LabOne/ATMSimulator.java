package LabOne;

import java.util.Arrays;

final class AccountData {
	private static final Account[] accounts = new Account[]{ new Account(0, 100),
															 new Account(1, 100),
															 new Account(2, 100),
															 new Account(3, 100),
															 new Account(4, 100),
															 new Account(5, 100),
															 new Account(6, 100),
															 new Account(7, 100),
															 new Account(8, 100),
															 new Account(9, 100)
															};

	public static Account[] getAccountsData(){
		return AccountData.accounts;
	}

	public final class ATMSimulator {
		private Account               _currentAccount;
		public final ATMUserInterface atmUserInterface;

		public ATMSimulator(ATMUserInterface atmUserInterface) {
			this.atmUserInterface = atmUserInterface;
		}
		public ATMSimulator() {
			this(new ATMUserInterface());
		}

		//region getter & setter
		public Account getCurrentAccount() {
			return _currentAccount;
		}

		public void setCurrentAccount(Account _currentAccount) {
			this._currentAccount = _currentAccount;
		}

		//endregion

		/**
		 * @param id 要检查的id
		 * @return 数据库中是否存在id
		 */
		public boolean checkAccountId(int id){
			return Arrays.stream(AccountData.getAccountsData()).anyMatch(a -> a.getId() == id);
		}

	}
}
