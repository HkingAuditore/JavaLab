package LabOne.Atm;

import LabOne.Account.AccountException;

@FunctionalInterface
interface IMethod {
    void execute() throws AtmException, AccountException;
}

public class AtmMethodHandler {

    /**
     * 方法的名称
     */
    private final String _methodName;
	/**
	 * 调用的方法
	 */
	private final IMethod _method;

	/**
	 *
	 * @param methodName 方法名称
	 * @param method 执行的方法
	 */
    public AtmMethodHandler(String methodName, IMethod method) {
        this._methodName = methodName;
        this._method = method;
    }

    public String getMethodName() {
        return _methodName;
    }

    /**
     * 执行函数式接口
     */
    public final void execute() throws AtmException, AccountException {
        _method.execute();
    }


}

