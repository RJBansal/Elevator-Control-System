//****************************************************************************
//
// Filename: InputParserException.java
//
// Description: Input Parser Exception class
//
//***************************************************************************

package core.Exceptions;

public class InputParserException extends GeneralException {

	private static final long serialVersionUID = -1913340013266999447L;

	public InputParserException(String message) {
		
        super(message);
    }

    public InputParserException(Throwable cause) {
    	
        super(cause);
    }

    public InputParserException(String message, Throwable cause) {
    	
        super(message, cause);
    }
}
