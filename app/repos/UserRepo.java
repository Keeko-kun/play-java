package repos;

import models.*;

import play.libs.Json;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import services.*;
import com.fasterxml.jackson.databind.JsonNode;

public class UserRepo {
    
    public UserRepo()
    {

    }

    public String Login(String username, String password){
        Session session = HibernateUtil.factory().openSession();
        User user;

        try {
            Query q = session.getNamedQuery("User.auth");
            q.setParameter("username", username);
            q.setParameter("password", password);
            user = (User) q.getSingleResult();
        }
        catch (Exception e) {
            user = null;
        }
        finally{
            session.close();
        }

        if (user != null){
            return JwtUtil.createToken(user.getUsername(), user.getPassword(), user.getIsAdmin());
        }
        else{
            return null;
        }
    }

    public String GetUsernameFromToken(String token){
        String username = JwtUtil.getUsernameFromToken(token);

        return username;
    }

    public JsonNode AddUser(){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;
        User user;

        try{
            tx = session.beginTransaction();
            user = new User("admin", "admin", true);
            session.save(user);
            tx.commit();
        }
        catch (Exception ex){
            throw ex;
        }
        finally {
            session.close();
        }

        return Json.toJson(user);
    }

}