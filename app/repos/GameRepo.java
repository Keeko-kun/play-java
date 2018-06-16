package repos;

import models.*;

import play.libs.Json;
import java.util.*;
import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import services.HibernateUtil;
import com.fasterxml.jackson.databind.JsonNode;

public class GameRepo {
    
    public GameRepo()
    {

    }

    public Game FindGame(int id){
        Session session = HibernateUtil.factory().openSession();
        Game game;

        try {
            Query q = session.getNamedQuery("Game.FindById");
            q.setParameter("id", new Long(id));
            game = (Game) q.getSingleResult();
        }
        catch (Exception e) {
            game = null;
        }
        finally{
            session.close();
        }

        return game;
    }

    public List<Game> GetAllGames(){
        Session session = HibernateUtil.factory().openSession();
        List<Game> games;

        try {
            Query q = session.getNamedQuery("Game.GetAll");
            games = q.getResultList();
        }
        catch (Exception e) {
            games = null;
        }
        finally{
            session.close();
        }

        return games;
    }

    public void AddGame(String name, int price, String url){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;

        Game game;

        try{
            tx = session.beginTransaction();

            game = new Game();
            game.setName(name);
            game.setPrice(price);
            game.setUrl(url);

            session.persist(game);
            tx.commit();
        }
        catch (Exception ex){
            throw ex;
        }
        finally {
            session.close();
        }
    }

    public void GenerateData(){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;
        User user;
        Game game;
        Review review;
        Review review2;

        try{
            tx = session.beginTransaction();

            user = new User();
            user.setUsername("bart");
            user.setPassword("simpson");
            user.setAdmin(true);
            session.persist(user);

            game = new Game();
            game.setName("Super Mario Maker");
            game.setPrice(60);
            game.setUrl("smm.jpg");
            session.persist(game);

            review = new Review();
            review.setReviewText("Very good game, yes.");
            review.setScore(45);
            review.setUser(user);
            review.setGame(game);

            review2 = new Review();
            review2.setReviewText("I hate this game lol.");
            review2.setScore(78);
            review2.setUser(user);
            review2.setGame(game);

            session.persist(review);
            session.persist(review2);
            tx.commit();
        }
        catch (Exception ex){
            throw ex;
        }
        finally {
            session.close();
        }
    }

}