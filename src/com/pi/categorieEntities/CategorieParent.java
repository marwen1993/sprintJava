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
public class CategorieParent {
    private String nom;
    private int idp;

    public CategorieParent() {
    }

    public CategorieParent(String nom, int idp) {
        this.nom = nom;
        this.idp = idp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdP() {
        return idp;
    }

    public void setIdP(int idp) {
        this.idp = idp;
    }

     @Override
    public String toString() {
        return this.nom;
    
    }
public void PromptUser(){
    
}
}
