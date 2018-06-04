package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import models.*;

import repos.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class GameController extends Controller {

   public Result gamejson(){
       Game game = new Game("Dark Souls: Remastered", 60);

       return ok(Json.toJson(game));
   }

   public Result addUser(){
        UserRepo repo = new UserRepo();
        JsonNode json = repo.AddUser();
        return ok(json);
   }

   public Result newGame(){
        GameRepo repo = new GameRepo();
        JsonNode json = repo.AddGame("Dark Souls: Remastered", 60);
        return ok(json);
   }

   public Result getGame(){
        GameRepo repo = new GameRepo();
        JsonNode json = repo.GetGame();
        if (json == null){
            return badRequest(badrequest.render("Bad Request","401","Expected JSON, but received NULL."));
        }
        return ok(json);
   }

   public Result updateGame(){
    GameRepo repo = new GameRepo();
    JsonNode json = repo.UpdateGame();
    return ok(json);
   }

}
