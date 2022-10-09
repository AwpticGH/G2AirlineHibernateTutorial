/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Seeder;

import app.Model.AdminModel;
import database.Factory.AdminFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author rafifajarrr
 */
public class AdminSeeder {
    
    AdminFactory factory = new AdminFactory();
    
    public void seed(Configuration cfg) {
        AdminModel superAdmin = factory.create("Super Admin", "superadmin", "admin", true, true, true, true);
        AdminModel garuda = factory.create("Garuda Airways", "garuda", "garuda", true, false, true, false);
        AdminModel lionAir = factory.create("Lion Air", "lion", "lion", true, false, true, false);
        AdminModel analyst = factory.create("Log Analyst", "analyst", "analyst", false, true, false, false);
        AdminModel dbManager = factory.create("DB Manager", "manager", "manager", true, true, true, true);
        
        SessionFactory sf = cfg.addAnnotatedClass(AdminModel.class).buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(superAdmin);

        session.save(garuda);

        session.save(lionAir);
        
        session.save(analyst);
        
        session.save(dbManager);
        tx.commit();
        
        session.close();
    }
    
}
