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

public class ReviewController extends Controller {

    public Result GetTopSixReviews(){
        ReviewRepo repo = new ReviewRepo();
        List<Review> reviews = repo.GetTopSix();
        return ok(Json.toJson(reviews));
    }

}
