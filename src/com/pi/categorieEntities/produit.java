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
public class produit {
    public int id ;
    public int idCategorie;
    public int idUser;
    public String nom;
    public double prix;
    public int visib;

    public produit(int id, int idCategorie, int idUser, String nom, double prix, int visib) {
        this.id = id;
        this.idCategorie = idCategorie;
        this.idUser = idUser;
        this.nom = nom;
        this.prix = prix;
        this.visib = visib;
    }

    public produit() {
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

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getVisib() {
        return visib;
    }

    public void setVisib(int visib) {
        this.visib = visib;
    }

    @Override
    public String toString() {
        return "produit{" + "id=" + id + ", idCategorie=" + idCategorie + ", idUser=" + idUser + ", nom=" + nom + ", prix=" + prix + ", visib=" + visib + '}';
    }
    
    public void PromptUser(){
    
}
    
}
