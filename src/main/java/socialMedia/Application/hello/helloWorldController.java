package socialMedia.Application.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//@Controller----@ResponseBody to convert the object to json
@RestController
public class helloWorldController {
	
//	@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	
	@GetMapping(path="hello-world")
	public String helloWorld() {
		return "hello panay";
	}
	
	
	@GetMapping(path="hello-world-bean")
	public helloWorldBean returnBean() {
		return (new helloWorldBean("pranay",21));
	}
	
	@GetMapping(path="hello-world-bean/{name}")
	public helloWorldBean returnBean(@PathVariable String name) {
		return (new helloWorldBean(name,21));
	}
	

}
