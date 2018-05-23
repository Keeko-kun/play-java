package controllers;

import play.mvc.*;

import views.html.*;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

import services.HibernateUtil;

import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
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
