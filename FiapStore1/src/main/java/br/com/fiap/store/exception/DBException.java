package br.com.fiap.store.exception;

public class DBException extends Exception{
	
	public DBException() {
		super();
	}
	
	public DBException(String message, Throwable cause, boolean enableSuppression, boolean writebleStackTrace) {
		super(message, cause, enableSuppression, writebleStackTrace);
	}

	public DBException(String message) {
		super(message);
	}
	public DBException(Throwable cause) {
		super(cause);
	}
	
}
