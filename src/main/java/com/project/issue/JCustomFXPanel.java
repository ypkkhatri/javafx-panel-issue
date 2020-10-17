package com.project.issue;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Yougeshwar
 */
public class JCustomFXPanel extends javax.swing.JPanel {

    private JFXPanel fxContainer;
    private SampleController controller;

    public JCustomFXPanel() {
        initComponents();

        fxContainer = new JFXPanel();
        add(fxContainer, BorderLayout.CENTER);
        
        initFX();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    private void initFX() {
        Platform.runLater(() -> createScene());
    }

    private void createScene() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("sample.fxml"));
            Parent root = fxmlLoader.load();
            controller = fxmlLoader.getController();
            
            fxContainer.setScene(new Scene(root));
        } catch (IOException ex) {
            Logger.getLogger(JCustomFXPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
