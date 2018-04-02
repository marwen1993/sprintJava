/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.categorieService;

import com.pi.ICategorieService.IProduitService;
import com.pi.categorieEntities.produit;
import com.pi.connection.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chevc
 */
/*public class ProduitService implements IProduitService{
Connection conn = data.getInstance().getConnection();
    Statement stmt;
    @Override
    public void createProduit(produit p) {
 try {
            String req = "INSERT INTO produit (id,id_categorie,nom) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(req);
            stmt.setInt(1, p.getIdCategorie());
            stmt.setString(2, c.getNom());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<produit> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(produit p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/