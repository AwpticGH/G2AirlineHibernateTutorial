/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Factory;

import app.Model.AdminModel;
/**
 *
 * @author rafifajarrr
 */
public class AdminFactory {
    
    public AdminModel create(String name, String username, String password, boolean insertPriv, 
            boolean selectPriv, boolean updatePriv, boolean deletePriv) {
        AdminModel model = new AdminModel();
        model.setName(name);
        model.setUsername(username);
        model.setPassword(password);
        model.setInsertPriv(insertPriv);
        model.setSelectPriv(selectPriv);
        model.setUpdatePriv(updatePriv);
        model.setDeletePriv(deletePriv);
        
        return model;
    }
}
