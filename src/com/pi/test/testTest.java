/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.test;

import com.pi.categorieEntities.Categorie;
import com.pi.categorieEntities.CategorieParent;
import com.pi.categorieService.CategorieService;

/**
 *
 * @author chevc
 */
public class testTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategorieParent cp=new CategorieParent();
        Categorie c = new Categorie();
        CategorieService cat = new CategorieService();
        
        cat.createCategorie(new Categorie(1, "azertyyssyml"));
        cat.getAll().forEach(System.out::println);
    }
    
}
