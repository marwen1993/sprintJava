/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.categorieEntities;

/**
 *
 * @author chevc
 */
public class Categorie {
    
    public int id ;
    private CategorieParent categorie_parent;
    public String nom;

    public Categorie(int id, String nom) {
      
        this.id=id;
        this.nom = nom;
    }

    public CategorieParent getCategorie_parent() {
        return categorie_parent;
    }

   
    

    public Categorie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.nom;
    }
    
    
    


public void PromptUser(){
    
}
}