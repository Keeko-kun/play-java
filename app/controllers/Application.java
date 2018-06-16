package controllers;

import play.*;

import play.mvc.*;

import play.routing.JavaScriptReverseRouter;

import views.html.*;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

import services.HibernateUtil;

import models.*;

import play.libs.Json;

public class Application extends Controller{

    public Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(
            JavaScriptReverseRouter.create("JsRoutes",
                routes.javascript.AuthController.GetToken(),
                routes.javascript.ReviewController.GetTopSixReviews(),
                routes.javascript.AuthController.GetName()
            )
        );
    }

}

