package myPackage;

public class DifferentDimensionsException extends Exception {

	private static final long serialVersionUID = 1L;

	public DifferentDimensionsException() {
		super("DifferentDimensionsException");
	}

	public DifferentDimensionsException(String message) {
		super(message);
	}
}