package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import models.*;

import services.*;

import repos.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class AuthController extends Controller {

    public Result Authenticate(){
        UserRepo repo = new UserRepo();
        String token = repo.Login();
        if (token != null){
            return ok(badrequest.render("Succes", "0", token));
        }
        else {
            return ok(badrequest.render("User not found", "401", "This user does not exist."));
        }

    }

    public Result GetName(){
        UserRepo repo = new UserRepo();
        String token = repo.Login();
        String username = repo.GetUsernameFromToken(token);

        if (username != null){
            return ok(badrequest.render("Succes", "0", username));
        }
        else{
            return ok(badrequest.render("Invalid Token", "401", "The token was invalid."));
        }
    }

}
