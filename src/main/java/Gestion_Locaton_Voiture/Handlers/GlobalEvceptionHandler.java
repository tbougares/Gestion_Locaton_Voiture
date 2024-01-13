package Gestion_Locaton_Voiture.Handlers;

import java.util.HashSet;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalEvceptionHandler {
	
	
	/* @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<String> handleException(MethodArgumentNotValidException exp) {
	        var validationErrors = new HashSet<String>();
	        for(ObjectError error : exp.getBindingResult().getAllErrors()) {
	            var fieldName = ((FieldError)error).getField();
	            var errorMsg = error.getDefaultMessage();
	            validationErrors.add(String.format("%s-%s", fieldName, errorMsg));
	        }
	        /*var errorResponse = ErrorResponse.builder()
	                .errorMsg("Object not valid")
	                .validationErrors(validationErrors)
	                .build();

	        return ResponseEntity
	                .badRequest()
	                .body(error.toString());
	    }
*/

}
