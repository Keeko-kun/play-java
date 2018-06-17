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

    public Result NewReview(int id, int score, String review, String token){
        ReviewRepo repo = new ReviewRepo();
        repo.NewReview(id, score, review, token);
        return ok("added review for game with id " + id);
    }

    public Result FindReview(int id){
        ReviewRepo repo = new ReviewRepo();
        Review review = repo.FindReview(id);
        return ok(Json.toJson(review));
    }

    public Result GetByDeveloper(int id){
        ReviewRepo repo = new ReviewRepo();
        List<Review> reviews = repo.GetByDeveloper(id);
        return ok(Json.toJson(reviews));
    }

}
