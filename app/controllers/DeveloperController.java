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

public class DeveloperController extends Controller {

    public Result GetAllDevelopers(){
        DeveloperRepo repo = new DeveloperRepo();
        List<Developer> devs = repo.GetAllDevelopers();
        return ok(Json.toJson(devs));
    }

    public Result AddDeveloper(String studio, String ceo, boolean thirdParty, String parent, boolean indie){
        DeveloperRepo repo = new DeveloperRepo();
        repo.AddDeveloper(studio, ceo, thirdParty, parent, indie);
        return ok("");
    }

}
