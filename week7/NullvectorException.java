public class NullvectorException extends Exception {

	private static final long serialVersionUID = 1L;

	public NullvectorException() {
		super("Eines der uebergebenen Arrays ist ein Nullvektor!");
	}

	public NullvectorException(String message) {
		super(message);
	}
}
