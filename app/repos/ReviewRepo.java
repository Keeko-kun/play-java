package repos;

import models.*;

import play.libs.Json;
import java.util.*;
import java.util.Arrays;
import java.util.List;

import services.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import services.HibernateUtil;
import com.fasterxml.jackson.databind.JsonNode;

public class ReviewRepo {
    
    public ReviewRepo()
    {

    }

    public List<Review> GetByDeveloper(int id){
        Session session = HibernateUtil.factory().openSession();
        List<Review> reviews;

        try {
            Query q = session.getNamedQuery("Review.GetByDeveloper");
            q.setParameter("id", new Long(id));
            reviews = q.getResultList();
        }
        catch (Exception e) {
            reviews = null;
        }
        finally{
            session.close();
        }

        return reviews;
    }

    public Review FindReview(int id){
        Session session = HibernateUtil.factory().openSession();
        Review review;

        try {
            Query q = session.getNamedQuery("Review.FindById");
            q.setParameter("id", new Long(id));
            review = (Review) q.getSingleResult();
        }
        catch (Exception e) {
            review = null;
        }
        finally{
            session.close();
        }

        return review;
    }

    public void NewReview(int id, int score, String reviewText, String token){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;
        User user = new User();
        Game game = new Game();
        Review review;

        try {
            Query q = session.getNamedQuery("Game.FindById");
            q.setParameter("id", new Long(id));
            game = (Game) q.getSingleResult();

            Long userId = JwtUtil.getUserIdFromToken(token);
            Query q2 = session.getNamedQuery("User.FindById");
            q2.setParameter("id", new Long(userId));
            user = (User) q2.getSingleResult();

            tx = session.beginTransaction();
            review = new Review();
            review.setScore(score);
            review.setReviewText(reviewText);
            review.setGame(game);
            review.setUser(user);

            session.persist(review);
            tx.commit();
        }
        catch (Exception e) {
            System.out.println(user.getUsername());
        }
        finally{
            session.close();
        }
    }

    public List<Review> GetTopSix(){
        Session session = HibernateUtil.factory().openSession();
        List<Review> reviews;

        try {
            Query q = session.getNamedQuery("Review.TopSix");
            reviews = q.setMaxResults(6).getResultList();
        }
        catch (Exception e) {
            reviews = null;
        }
        finally{
            session.close();
        }

        return reviews;
    }

}