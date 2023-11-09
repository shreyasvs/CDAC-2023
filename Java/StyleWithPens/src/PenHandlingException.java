package custom_exceptions;

@SuppressWarnings("serial")
public class PenHandlingException extends Exception{
	public PenHandlingException(String errMesg) {
		super(errMesg);
	}
}
