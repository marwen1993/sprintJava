/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.gui;

import com.pi.categorieEntities.Categorie;
import com.pi.categorieService.CategorieService;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author chevc
 */
public class AjoutCategorieFXMLController implements Initializable {
     @FXML
    private TextField ftidcategorie;
    @FXML
    private TextField ftnom;
     @FXML
    private ListView<String> view;
    ObservableList<String> items=FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle rb) {
        CategorieService cat=new CategorieService();
        view.setItems(items);
        cat.getAll().forEach(a->items.add(a.getNom()));
    }
    
    /**
     *
     */
    @FXML
    public void AjoutCategorie(){
    CategorieService cat=new CategorieService();
        Categorie c = new Categorie();
        
        
         String str=ftidcategorie.getText();

  c.setIdCategorie(Integer.parseInt(str)); 
    c.setNom(ftnom.getText());
    cat.createCategorie(c);
    ftidcategorie.clear();
    ftnom.setText("");
    System.out.println("ajout effectué avec succée");
    items.clear();
    view.setItems(items);
cat.getAll().forEach(a->items.add(a.getNom()));
    
    view.getSelectionModel().select(items.size()-1);
    
}

    @FXML
    private void modifierCategorie(ActionEvent event) {
     

                CategorieService cs = new CategorieService();

                Categorie ct = new Categorie();
               view.getSelectionModel().select(items.size()-1);
                int idCategorie = ct.getIdCategorie();
                ct.setIdCategorie(idCategorie);

               ct.setNom(ftnom.getText());

                
                
               
                ObservableList<Categorie> tmp = FXCollections.observableArrayList();
                tmp.addAll(cs.getAll());
                view.setItems(items);
            } 

    @FXML
    private void supprimerCategorie(ActionEvent event) {
    }

        }
    
/*
    @FXML
    private void supprimerCategorie(ActionEvent event) {
    }
    if(idC)
}
*/