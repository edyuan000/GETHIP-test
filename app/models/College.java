package models;

import com.avaje.ebean.*;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class College extends Model{

private static final long serialVersionUID = 1L;

	public String name;
	@Id
	public Long id;
	public String st;
	public String webAddress;
	
//	public College(String name, Long id, String st, String webAddress){
//	this.name = name;
//	this.id = id;
//	this.st = st;
//	this.webAddress = webAddress;
//	}
	
	public static Finder<Long, College> find = new Finder<Long, College>(Long.class, College.class);
	
	
//	public static College create(College col){
	//	User user = new User(email, username, password);
	//	College col = new College(name, id, st, schoolAddress, webAddress);
//		col.save();
//		return col;
//	}

//	public static Page<College> page(int page, int pageSize, String sortBy, String order, String filter) {
//       return 
//            find.where()
//                .ilike("name", "%" + filter + "%")
//                .orderBy(sortBy + " " + order)
//                .fetch("company")
//                .findPagingList(pageSize)
//                .setFetchAhead(false)
//                .getPage(page);
//    }
     public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(College c: College.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }
	
	}