package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import play.data.validation.Constraints.*;

@Entity
public class infoForm extends Model{

@Id
@Required
public String sport;
@Required
public String state;

	
	public infoForm(String sport, String state){
	this.sport = sport;
	this.state = state;
	}
	
	public static Finder<String, infoForm> find = new Finder<String, infoForm>(String.class, infoForm.class);
	
		public static infoForm create(infoForm form){
	//	infoForm form = new infoForm(sport, state);
		form.save();
		return form;

}
}