package socialMedia.Application.versioningApi;

public class Person2 {
	private FullName name;

	public Person2(FullName name) {
		super();
		this.name = name;
	}

	public FullName getName() {
		return name;
	}

	public void setName(FullName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + "]";
	}
	
	

}
