package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import models.*;

import forms.*;

import services.*;

import repos.*;

import play.libs.Json;
import play.data.Form;
import play.data.FormFactory;
import com.fasterxml.jackson.databind.JsonNode;
import javax.inject.Singleton;
import javax.inject.Inject;

public class AuthController extends Controller {

    private final Form<LoginForm> loginForm;

    @Inject
    public AuthController(FormFactory formFactory){
        this.loginForm = formFactory.form(LoginForm.class);
    }

    public Result login(){
        final Form<LoginForm> bound = loginForm.bindFromRequest();
        LoginForm login = bound.get();

        UserRepo repo = new UserRepo();
        String token = repo.Login(login.username, login.password);


        if (token != null){
            return redirect("/home");
        }
        else {
            return redirect("/login");
        }
    }

    public Result Authenticate(){
        UserRepo repo = new UserRepo();
        String token = repo.Login("bart", "simpson");
        if (token != null){
            return ok(badrequest.render("Succes", "0", token));
        }
        else {
            return ok(badrequest.render("User not found", "401", "This user does not exist."));
        }
    }

    public Result GetName(String token){
        UserRepo repo = new UserRepo();
        String username = repo.GetUsernameFromToken(token);

        if (username != null){
            return ok(username);
        }
        else{
            return ok("");
        }
    }

    public Result GetToken(String username, String password){
        UserRepo repo = new UserRepo();
        String token = repo.Login(username, password);

        if (token != null){
            return ok(token);
        }
        else {
            return ok("");
        }
    }

    public Result VerifyAdmin(String token){
        boolean isAdmin = JwtUtil.VerifyAdmin(token);

        return ok(Json.toJson(isAdmin));
    }

}
