package socialMedia.Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDoaService {
	
	private static List<User> users=new ArrayList<>(); 
	static int countUser=0;
	
	static {
		users.add(new User(++countUser,"pranay",LocalDate.now()));
		users.add(new User(++countUser,"dharani",LocalDate.now()));
		users.add(new User(++countUser,"goutami",LocalDate.now()));
	}
	
	public List<User> retriveALlUsers(){
		return users;
	}
	

	public User findByIdUsers(Integer id) {
		   for (User user : users) {
	            if (user.getId().equals(id)) {
	                return user; // Found the user with the matching ID
	            }
	        }
		   return null;
	}
	
	
	

	public User save(User user) {
		 user.setId(++countUser);
		 users.add(user);
		 return user;
		
	}


	public void deletebyId(int id) {
		for (User user : users) {
            if (user.getId().equals(id)) {
                  users.remove(user); // Found the user with the matching ID
            }
        }
	  
	}
}
