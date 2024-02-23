package socialMedia.Application;

import java.net.URI; 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {
	
	@Autowired
	private UserJpaRepository userJpaService;
	
	@GetMapping(path="/jpa/users")
	public List<User> listAllUsers(){
		return userJpaService.findAll();
	}
	@GetMapping(path="/jpa/users/{id}")
	public User listByIdUsers(@PathVariable int id) {
		Optional<User> user =userJpaService.findById(id);
		if(user.isEmpty()) {
			throw new UserNotFoundException("id:"+id);
		}
		
//		EntityModel<User> userEntity=EntityModel.of(user);
//		WebMvcLinkBuilder Link = linkTo(methodOn(this.getClass()).listAllUsers());
//		userEntity.add(Link.withRel("all-users"));
		
		return  user.get();
	}
	
	
	@DeleteMapping(path="/jpa/users/{id}")
	public void deleteByid(@PathVariable int id) {
		userJpaService.deleteById(id);
	}
	
	
	
	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		//@RequestBody Used to post the Userdetails  as json to object
		User saveUser= userJpaService.save(user);
		URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveUser.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	
}
