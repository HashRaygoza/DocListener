/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hash.databaseio.doclistener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author draygoza
 */
public class CuentaCaracteres implements DocumentListener, Runnable {
    private final JPasswordField campoPassword;
    static private final int DATA_LENGTH = 80;
    
    public CuentaCaracteres(JPasswordField c) {
        campoPassword = c;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        String texto = new String(campoPassword.getPassword());
        
        if(texto.length() == CuentaCaracteres.DATA_LENGTH) {
            SwingUtilities.invokeLater(this);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        
    }

    @Override
    public void run() {
        campoPassword.requestFocus();
        JOptionPane.showMessageDialog(campoPassword, "TODOS LOS DATOS LEIDOS");
        campoPassword.setText("");
    }
    
}
