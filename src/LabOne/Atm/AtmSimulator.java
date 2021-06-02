package LabOne.Atm;

import LabOne.Account.Account;
import LabOne.Account.AccountException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class AtmSimulator {
    private final AtmUserInterface _atmUserInterface;
    private Account _currentAccount;
    /**
     * ATM可供使用的功能
     */
    private final List<AtmMethodHandler> _methods = new ArrayList<AtmMethodHandler>();

    public AtmSimulator() {
        _atmUserInterface = new AtmUserInterface(this);

        // 注册方法
        registerMethods();
    }

    // region getter & setter
    public Account getCurrentAccount() {
        return _currentAccount;
    }

    public void setCurrentAccount(Account _currentAccount) {
        this._currentAccount = _currentAccount;
    }

    public List<AtmMethodHandler> getMethods() {
        return _methods;
    }

    // endregion

    // region 处理逻辑

    // region 功能逻辑

    /**
     * 查询余额
     */
    public void checkBalance() {
        _atmUserInterface.show("账户余额是： " + this.getCurrentAccount().getBalance());
    }

    /**
     * 取款
     */
    public void withdraw() throws AccountException {
        double withdrawMoney = _atmUserInterface.getInputDouble("输入取款数额");
        _currentAccount.withdraw(withdrawMoney);
    }

    /**
     * 存款
     */
    public void deposit() {
        double depositMoney = _atmUserInterface.getInputDouble("输入存款数额");
        _currentAccount.deposit(depositMoney);
    }

    /**
     * 退出
     */
    public void exit() throws AtmException {
        throw new AtmException("退出");
    }

    // endregion

    // region 运行逻辑

    /**
     * 注册方法
     */
    private void registerMethods() {
        // 查看余额
        this._methods.add(new AtmMethodHandler("检查余额", this::checkBalance));

        // 取钱
        this._methods.add(new AtmMethodHandler("取款", this::withdraw));

        // 存钱
        this._methods.add(new AtmMethodHandler("存款", this::deposit));

        // 退出
        this._methods.add(new AtmMethodHandler("退出", this::exit));

    }

    /**
     * 逻辑帧执行
     */
    public void Update() throws AtmException {
        this._atmUserInterface.showLine();
        this._atmUserInterface.showMenu();
        int methodChoice = this._atmUserInterface.getInputInt("输入想使用的功能");
        while (methodChoice > _methods.size()) {
            this._atmUserInterface.show("输入有误！请检查输入范围，重新输入");
            methodChoice = this._atmUserInterface.getInputInt("输入想使用的功能");
        }
        try {
            this._methods.get(methodChoice).execute();
        } catch (AccountException e) {
            this._atmUserInterface.show(e.getMessage());
        }

    }
    // endregion

    // region 账号处理

    /**
     * 检查账号存在性
     *
     * @param id 要检查的id
     * @return 数据库中是否存在id
     */
    public boolean checkAccountId(int id) {
        return Arrays.stream(AccountData.getAccountsData()).anyMatch(a -> a.getId() == id);
    }

    /**
     * 获取账号
     *
     * @param id 要获取的账号的id
     * @return 返回的Account(找不到为null)
     */
    public Account getAccount(int id) {
        Optional<Account> opAccount = Arrays.stream(AccountData.getAccountsData()).filter(a -> a.getId() == id)
                .findAny();
        return opAccount.orElse(null);

    }

    /**
     * 要求用户输入账号
     *
     * @throws AtmException ATM错误
     */
    public void readCurrentAccount() throws AtmException {
        int targetAccount = _atmUserInterface.getInputInt("输入要操作的账号");
        this.setCurrentAccount(getAccount(targetAccount));
        if (this.getCurrentAccount() == null) {
            this._atmUserInterface.show("找不到此账号");
            exit();
        }
    }

    // endregion

    // endregion
}
