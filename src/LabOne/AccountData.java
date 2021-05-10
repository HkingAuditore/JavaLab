package LabOne;

final class AccountData {
    private static final Account[] accounts = new Account[]{new Account(0, 100), new Account(1, 100), new Account(2, 100), new Account(3, 100), new Account(4, 100), new Account(5, 100), new Account(6, 100), new Account(
            7, 100), new Account(8, 100), new Account(9, 100)};

    public static Account[] getAccountsData() {
        return AccountData.accounts;
    }
}
