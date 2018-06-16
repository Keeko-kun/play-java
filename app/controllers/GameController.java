package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import models.*;

import repos.*;

import java.util.*;
import java.util.Arrays;
import java.util.List;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class GameController extends Controller {

    public Result GetAllGames(){
        GameRepo repo = new GameRepo();
        List<Game> games = repo.GetAllGames();
        return ok(Json.toJson(games));
    }

    public Result AddGame(String name, int price, String url){
        GameRepo repo = new GameRepo();
        repo.AddGame(name, price, url);
        return ok("did it reddit");
    }

    public Result FindGame(int id){
        GameRepo repo = new GameRepo();
        Game game = repo.FindGame(id);
        return ok(Json.toJson(game));
    }

}
