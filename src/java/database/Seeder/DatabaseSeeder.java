/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Seeder;

import org.hibernate.cfg.Configuration;

/**
 *
 * @author rafifajarrr
 */
public class DatabaseSeeder {
    
    private static Configuration cfg;
    private static final AdminSeeder admins = new AdminSeeder();
    
    public static void main(String[] args) {
        System.out.println("Seeding Database");
        
        cfg = new Configuration().configure("hibernate_insert.cfg.xml");
        admins.seed(cfg);
        
        System.out.println("Database Seeded");
    }
}
