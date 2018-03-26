/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.ICategorieService;

import com.pi.categorieEntities.Categorie;
import java.util.List;

/**
 *
 * @author chevc
 */
public interface ICategorieService {
    public void createCategorie(Categorie c);

    public List<Categorie> getAll();

    public void update(Categorie c);

    public void delete(int id);
    
}
