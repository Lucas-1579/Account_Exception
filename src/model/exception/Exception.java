package model.exception;

public class Exception extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public Exception(String msgError) {
		super(msgError);
	}

}
