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
    public int idCategorie;
    public String nom;

    public Categorie(int idCategorie, String nom) {
      
        this.idCategorie = idCategorie;
        this.nom = nom;
    }

    public Categorie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", idCategorie=" + idCategorie + ", nom=" + nom + '}';
    }
    
    
    


public void PromptUser(){
    
}
}