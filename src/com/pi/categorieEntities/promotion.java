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
public class promotion {
    public int id;
    public int produit_id;
    public String nom;
    public String dateDebut;
    public String dateFin;
    public int pourcentage;
    public int idUser;

    public promotion(int id, int produit_id, String nom, String dateDebut, String dateFin, int pourcentage, int idUser) {
        this.id = id;
        this.produit_id = produit_id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.pourcentage = pourcentage;
        this.idUser = idUser;
    }

    public promotion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduit_id() {
        return produit_id;
    }

    public void setProduit_id(int produit_id) {
        this.produit_id = produit_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "promotion{" + "id=" + id + ", produit_id=" + produit_id + ", nom=" + nom + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", pourcentage=" + pourcentage + ", idUser=" + idUser + '}';
    }
    public void PromptUser(){
    
}
    
    
}
