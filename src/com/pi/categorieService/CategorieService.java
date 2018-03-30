/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.categorieService;

import com.pi.ICategorieService.ICategorieService;
import com.pi.categorieEntities.Categorie;
import com.pi.connection.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chevc
 */
public class CategorieService implements ICategorieService {

    Connection conn = data.getInstance().getConnection();
    Statement stmt;

    
    
    

    
    

    
  
    public void createCategorie(Categorie c) {
        try {
            String req = "INSERT INTO categorieproduit (id_categorie,nom) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(req);
            st.setInt(1, c.getIdCategorie());
            st.setString(2, c.getNom());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    


 
public List<Categorie> getAll() {
        ArrayList<Categorie> listCategorie = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from categorieproduit");
            while (rs.next()) {
                System.out.println(rs.getInt(2) + " (" + rs.getString(3) + ")");
                listCategorie.add(new Categorie(rs.getInt(2),
                        
                        rs.getString(3)) );
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCategorie;
}



    public void update(Categorie c) {
        try {
            String req = "UPDATE `categorieproduit` SET `nom` = ? WHERE `id_categorie` = ?";
            PreparedStatement st = conn.prepareStatement(req);
            st.setInt(1, c.getIdCategorie());
            st.setString(2, c.getNom());

            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   /*
    public void delete(int id) {
        try {
            String req = "DELETE FROM `categorieproduit` WHERE `categorie`.`id` = ? ";
            PreparedStatement st = conn.prepareStatement(req);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    

    
    
*/
}
