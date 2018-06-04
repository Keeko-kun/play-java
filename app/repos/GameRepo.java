package repos;

import models.*;

import play.libs.Json;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import services.HibernateUtil;
import com.fasterxml.jackson.databind.JsonNode;

public class GameRepo {
    
    public GameRepo()
    {

    }

    public JsonNode AddGame(String title, int price){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;
        Game game;

        try{
            tx = session.beginTransaction();
            game = new Game(title, price);
            session.save(game);
            tx.commit();
        }
        catch (Exception ex){
            throw ex;
        }
        finally {
            session.close();
        }

        return Json.toJson(game);
    }

    public JsonNode UpdateGame(){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;
        Game g;

        try{
            tx = session.beginTransaction();
            g = session.get(Game.class, 2L);
            g.setName("Mario Kart");
            session.update(g);
            tx.commit();
        }
        catch (Exception ex){
            return null;
        }
        finally {
            session.close();
        }

        return Json.toJson(g);
    }

    public JsonNode GetGame(){
        Session session = HibernateUtil.factory().openSession();
        Game g;

        try {
            Query q = session.getNamedQuery("Game.findById");
            q.setParameter("id", 4L);
            g = (Game) q.getSingleResult();
        } 
        catch (Exception e) {
            return null;
        }
        finally{
            session.close();
        }

        return Json.toJson(g);
    }

}