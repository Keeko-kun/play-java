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

public class ReviewRepo {
    
    public ReviewRepo()
    {

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