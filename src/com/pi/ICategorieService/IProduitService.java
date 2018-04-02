/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.ICategorieService;

import com.pi.categorieEntities.Categorie;
import com.pi.categorieEntities.produit;
import java.util.List;

/**
 *
 * @author chevc
 */
public interface IProduitService {
    public void createProduit(produit p);

  public List<produit> getAll();

    public void update(produit p);

    public void delete(int id);
}
