/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Migration;

import app.Model.AdminModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author rafifajarrr
 */
public class DatabaseMigration {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("Initializing Tables");
        
        Configuration cfg = new Configuration().configure("hibernate_create.cfg.xml")
                .addAnnotatedClass(AdminModel.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        session.beginTransaction().commit();
        session.close();
        
        System.out.println("Tables Initialized");
    }
}
