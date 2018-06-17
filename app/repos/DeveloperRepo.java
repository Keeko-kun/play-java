package repos;

import models.*;

import play.libs.Json;
import java.util.*;
import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import services.*;
import com.fasterxml.jackson.databind.JsonNode;

public class DeveloperRepo {
    
    public DeveloperRepo()
    {

    }

    public List<Developer> GetAllDevelopers(){
        Session session = HibernateUtil.factory().openSession();
        List<Developer> devs;

        try {
            Query q = session.createQuery("select d from Developer as d");
            devs = q.getResultList();
        }
        catch (Exception e) {
            devs = null;
        }
        finally{
            session.close();
        }

        return devs;
    }

    public void AddDeveloper(String studio, String ceo, boolean thirdParty, String parent, boolean indie){
        Session session = HibernateUtil.factory().openSession();
        Transaction tx = null;

        FirstParty fp;
        ThirdParty tp;

        try{
            tx = session.beginTransaction();

            if (thirdParty){
                tp = new ThirdParty();
                tp.setName(studio);
                tp.setCeo(ceo);
                tp.setIndieStudio(indie);
                session.persist(tp);
            }
            else {
                fp = new FirstParty();
                fp.setName(studio);
                fp.setCeo(ceo);
                fp.setParent(parent);
                session.persist(fp);
            }

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