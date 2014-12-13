package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

@Entity
public class College extends Model{

	@Id
	public String name;
	public Long code;
	
	public College(String name, Long code){
	this.name = name;
	this.code = code;
	}
	
	public static Finder<String, College> find = new Finder<String, College>(String.class, College.class);
	}