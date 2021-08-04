package edu.java.training.chapter9.customexception;

public class EmptyFileException extends Exception {	
	
	private static final long serialVersionUID = 1L;
	
	public EmptyFileException() {				
	}

	public EmptyFileException(String message) {
		super(message);		
	}	
	
	public EmptyFileException(String message, Throwable couse) {
		super(message,couse);		
	}	
	
	public EmptyFileException(Throwable couse) {
		super(couse);		
	}

	@Override
	public String toString() {
		return "EmptyFileException [File is Empty]";
	}	
	
}
