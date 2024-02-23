package socialMedia.Application.versioningApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public Person getFirstVersionOfPerson() {
		return new Person("pranay Jugge");
	}
	
	@GetMapping("/v2/person")
	public Person2 getSecoundVersionOfPerson() {
		return new Person2(new FullName("pranay","Jugge"));
	
   }
	
	@GetMapping(path="/person",params="version=1")
	public Person getFirstVersionRequestOfPerson() {
		return new Person("pranay Jugge");
	}
	
	@GetMapping(path="/person",params="version=2")
	public Person2 getSecoundVersionRequestOfPerson() {
		return new Person2(new FullName("pranay","Jugge"));
	
   }
}
