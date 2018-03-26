/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chevc
 */
public class data {
    

    Connection connexion;
    final String url = "jdbc:mysql://localhost:3306/pidev";
    final String user = "root";
    final String password = "";
    private static data instance;

    private data() {
        try {
            connexion = DriverManager.getConnection(url, user, password);

        } catch (SQLException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static data getInstance() {
        if (instance == null) {
            instance = new data();
        }

        return instance;
    }

    public Connection getConnection() {
        return connexion;
    }
}

