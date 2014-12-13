package controllers;

import play.*;
import play.mvc.*;
import models.*;
import views.html.*;
import play.data.*;

public class Application extends Controller {

static Form<infoForm> iForm = Form.form(infoForm.class);

    public static Result index() {
        return ok(index.render(iForm));
    }

	
	public static Result newInfoForm(){
		Form<infoForm> filledForm = iForm.bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(index.render(filledForm));
		} else{
			infoForm.create(filledForm.get());
			return ok(index.render(iForm));
		}
	}
}
