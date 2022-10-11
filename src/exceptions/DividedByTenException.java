package exceptions;

public class DividedByTenException extends Exception {

	private static final long serialVersionUID = 1L;

	public DividedByTenException() {}

	public DividedByTenException(String message) {
		super(message);
	}

}
