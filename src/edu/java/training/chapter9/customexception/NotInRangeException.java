package edu.java.training.chapter9.customexception;

public class NotInRangeException extends Exception{	
	
	private static final long serialVersionUID = 1L;

	public NotInRangeException() {				
	}

	public NotInRangeException(String message) {
		super(message);		
	}	
	
	public NotInRangeException(String message, Throwable couse) {
		super(message,couse);		
	}	
	
	public NotInRangeException(Throwable couse) {
		super(couse);		
	}

	@Override
	public String toString() {
		return "NotInRangeException [Number is not in range]";
	}

}
