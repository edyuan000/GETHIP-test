package controllers;

import play.*;
import play.mvc.*;
import models.*;
import views.html.*;
import play.data.*;

public class Application extends Controller {

<<<<<<< HEAD
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
=======
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
>>>>>>> a17284c70c749701b1d49f9913e2ab215b6bf094
		}
	}
}
