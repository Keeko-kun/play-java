package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

import services.HibernateUtil;

import models.*;

import play.libs.Json;

public class HomeController extends Controller {

    public Result index() {
        return ok(index.render("Your new application is dead."));
    }

    public Result app() {
        return  ok(app.render());
    }

    public Result cake(){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;


        try{
            tx = session.beginTransaction();
            Cake cake;
            cake = new Cake("choco");
            session.save(cake);

            tx.commit();
        }
        catch (Exception ex){
            throw ex;
        }
        finally {
            session.close();
        }

        return ok("Cake aangemaakt!");
    }

}
