package socialMedia.Application;

import java.time.LocalDate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExecptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class) 
	public final ResponseEntity<ErrorDetails> handlerException(Exception ex,WebRequest request){
		ErrorDetails error=new ErrorDetails(LocalDate.now(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(UserNotFoundException.class) 
	public final ResponseEntity<ErrorDetails> handlerUserNotFoundException(Exception ex,WebRequest request){
		ErrorDetails error=new ErrorDetails(LocalDate.now(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.NOT_FOUND);
		
	}
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        ErrorDetails error=new ErrorDetails(LocalDate.now(),"Total Error : "+ex.getErrorCount()+"  FirstError : "+ ex.getFieldError().getDefaultMessage(),request.getDescription(false));
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST); 
		
		
	}

	
	
	
	
}
