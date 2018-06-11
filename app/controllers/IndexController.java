package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

import services.HibernateUtil;

import models.*;

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
