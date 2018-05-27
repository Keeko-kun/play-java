package services;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import models.*;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml)
            // config file.
            Thread.currentThread().setContextClassLoader(Cake.class.getClassLoader());
            Thread.currentThread().setContextClassLoader(Game.class.getClassLoader());
            sessionFactory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Cake.class)
                    .addAnnotatedClass(Game.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory factory() {
        return sessionFactory;
    }
}