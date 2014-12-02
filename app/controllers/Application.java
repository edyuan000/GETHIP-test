package controllers;

import play.*;
import play.mvc.*;
import models.*;
import views.html.*;
import play.data.*;

public class Application extends Controller {

static Form<User> userForm = Form.form(User.class);

    public static Result index() {
        return ok(index.render(User.find.all(), userForm));
    }

	
	public static Result newUser(){
		Form<User> filledForm = userForm.bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(index.render(User.find.all(), filledForm));
		} else{
			User.create(filledForm.get());
			return ok(index.render(User.find.all(), userForm));
		}
	}
}
