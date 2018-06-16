package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

import services.HibernateUtil;

import models.*;

import repos.*;

import play.libs.Json;
import play.data.Form;
import play.data.FormFactory;

public class IndexController extends Controller {

    public Result index() {
        return ok(home.render());
    }

    public Result home() {
        return  ok(home.render());
    }

    public Result login() {
        return ok(login.render());
    }

    public Result game(){
        return ok(games.render());
    }

    public Result gamePage(int id){
        return ok(gamePage.render());
    }

    public Result cake(){
        GameRepo repo;
        repo = new GameRepo();
        repo.GenerateData();
        return ok("did it");
    }

}
