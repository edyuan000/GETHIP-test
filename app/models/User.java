package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import play.data.validation.Constraints.*;

@Entity
public class User extends Model{

	@Id
	@Required
	public String email;
	@Required
	public String username;
	@Required
	public String password;
	
	public User(String email, String name, String password){
	this.email = email;
	this.username = name;
	this.password = password;
	}
	
	public static Finder<String, User> find = new Finder<String, User>(String.class, User.class);
	
		public static User create(User user){
	//	User user = new User(email, username, password);
		user.save();
		return user;
	}
}