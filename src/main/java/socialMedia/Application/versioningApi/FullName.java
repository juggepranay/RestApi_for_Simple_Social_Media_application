package socialMedia.Application.versioningApi;

public class FullName {
	private String firstName;
	private String LastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public FullName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", LastName=" + LastName + "]";
	}

}
