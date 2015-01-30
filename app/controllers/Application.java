package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class Application extends Controller {
    
    /**
     * This result directly redirect to application home.
     */
    public static Result GO_HOME = redirect(
        routes.Application.list(0, "name", "asc", "")
    );
    
    /**
     * Handle default path requests, redirect to computers list
     */
    public static Result index() {
        return GO_HOME;
    }

    /**
     * Display the paginated list of computers.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Sport.page(page, 220, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
    
    /**
     * Display the 'edit form' of a existing Computer.
     *
     * @param id Id of the computer to edit
     */
    public static Result edit(Long id) {
        Form<Sport> sportForm = form(Sport.class).fill(
            Sport.find.byId(id)
        );
        return ok(
            editForm.render(id, sportForm)
        );
    }
    
    /** 
     * Handle the 'edit form' submission 
     *
     * @param id Id of the computer to edit
     */
    public static Result update(Long id) {
        Form<Sport> sportForm = form(Sport.class).bindFromRequest();
        if(sportForm.hasErrors()) {
			flash("Please fill out entire form correctly");
            return badRequest(editForm.render(id, sportForm));
        }
        sportForm.get().update(id);
        flash("success", "Sport " + sportForm.get().sportname + " has been updated");
        return GO_HOME;
    }
    
    /**
     * Display the 'new computer form'.
     */
    public static Result create() {
        Form<Sport> sportForm = form(Sport.class);
		
        return ok(
            createForm.render(sportForm)
        );
    }
    
    /**
     * Handle the 'new computer form' submission 
     */
    public static Result save() {
        Form<Sport> sportForm = form(Sport.class).bindFromRequest();
        if(sportForm.hasErrors()) {
            return badRequest(createForm.render(sportForm));
        }
        sportForm.get().save();
        flash("success", "Sport " + sportForm.get().sportname + " has been created");
        return GO_HOME;
    }
    
    /**
     * Handle computer deletion
     */
    public static Result delete(Long id) {
        Sport.find.ref(id).delete();
        flash("success", "Sport has been deleted");
        return GO_HOME;
    }
    

}
            