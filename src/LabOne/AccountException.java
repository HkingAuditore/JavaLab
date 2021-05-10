package LabOne;

public class AccountException extends Exception {
	private final AccountExceptionType exceptionType;

	public AccountException(String message, AccountExceptionType exceptionType){
		super(message);
		this.exceptionType = exceptionType;
	}

	public AccountExceptionType getExceptionType() {
		return exceptionType;
	}
}
