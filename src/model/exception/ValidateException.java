package model.exception;

import java.util.HashMap;
import java.util.Map;

public class ValidateException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>();
	
	public ValidateException(String msg) {
		super(msg);
	}

	public Map<String, String> getErros(){
		return errors;
	}
	
	public void addErros(String fieldName, String errorsMessage) {
		errors.put(fieldName, errorsMessage);
	}
	
}
