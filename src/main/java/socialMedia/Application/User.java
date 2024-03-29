package socialMedia.Application;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


@Entity(name="user_details")
public class User {
	
	
	User(){};
	
	@JsonIgnore
	@OneToMany(mappedBy="user")
	private List<Post> listOfPost;
	
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min=2,message="Name should have atleast 2 digits")
	
	@JsonProperty("Username")
	private String name;
	
	@Past(message="birthDate should be past")
	private LocalDate birthDate;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public List<Post> getListOfPost() {
		return listOfPost;
	}
	
	public void setListOfPost(List<Post> listOfPost) {
		this.listOfPost = listOfPost;
	}
	
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	

}
