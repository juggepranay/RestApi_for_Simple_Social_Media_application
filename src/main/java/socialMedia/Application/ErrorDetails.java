package socialMedia.Application;

import java.time.LocalDate;

public class ErrorDetails {
	
	private LocalDate timeStamp;
	private String Message;
	private String details;
	
	public ErrorDetails(LocalDate timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.Message = message;
		this.details = details;
	}
	@Override
	public String toString() {
		return "ErrorDetails [timeStamp=" + timeStamp + ", Message=" + Message + ", details=" + details + "]";
	}
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
