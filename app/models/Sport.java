package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import play.data.validation.*;

@Entity
public class Sport extends Model{


private static final long serialVersionUID = 1L;
//	@Id
//	public Long id;
	public String sportname;
	
	@Id
	public Long sportid;
	public String division;
	@ManyToOne
	public College college;
	public String prospectform;
	
//	public Sport(String sportName, Long id, String division){
//		this.sportName = sportName;
//		this.schoolId = id;
//		this.division = division;
//	}
	
	public static Finder<Long, Sport> find = new Finder<Long, Sport>(Long.class, Sport.class);
	
	
//	public static College create(College col){
	//	User user = new User(email, username, password);
	//	College col = new College(name, id, st, schoolAddress, webAddress);
//		col.save();
//		return col;
//	}

	public static Page<Sport> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("sportname", filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("college")
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }
	
	public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Sport c: Sport.find.orderBy("division").findList()) {
            options.put(c.division.toString(), c.division);
        }
        return options;
    }
	}