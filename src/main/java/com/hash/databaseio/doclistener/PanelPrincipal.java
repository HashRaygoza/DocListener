/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hash.databaseio.doclistener;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author draygoza
 */
public class PanelPrincipal extends JPanel {
    private final JPasswordField campoPassword;
    JLabel label = new JLabel("Por favor lea la tarjeta de banda magnetica");

    public PanelPrincipal() {
        campoPassword = new JPasswordField(100);
        
        campoPassword.getDocument().addDocumentListener(new CuentaCaracteres(campoPassword) );
        this.prepararInterfaz();
    }
    
    private void prepararInterfaz() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(campoPassword, gbc);
        add(label, gbc);
    }
}
