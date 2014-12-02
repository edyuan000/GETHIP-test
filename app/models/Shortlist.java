package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;

@Entity
public class Shortlist extends Model{
	@Id
	public Long id;
	public String name;
	@ManyToOne
	public User user;
	@ManyToMany(cascade = CascadeType.REMOVE)
	public List<College> colleges = new ArrayList<College>();
	
	
	public Shortlist(String name, User owner){
		this.name = name;
		this.user = owner;
	}
	
	public static Finder<Long, Shortlist> find = new Finder<Long, Shortlist>(Long.class, Shortlist.class);
	
	public static Shortlist create(String name, String ownerEmail){
		Shortlist collegeList = new Shortlist(name, User.find.ref(ownerEmail));
		collegeList.save();
		return collegeList;
	}
	
}