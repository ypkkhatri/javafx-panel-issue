package com.project.issue;

import java.awt.BorderLayout;
import javafx.application.Platform;

/**
 *
 * @author Yougeshwar
 */
public class JMainFrame extends javax.swing.JFrame {

    private JCustomFXPanel jCustomFXPanel;
    private JParentPanel jParentPanel;

    public JMainFrame() {
        initComponents();
        jCustomFXPanel = new JCustomFXPanel();

        jParentPanel = new JParentPanel();
        jParentPanel.add(jCustomFXPanel, BorderLayout.CENTER);

        add(jParentPanel, BorderLayout.CENTER);

        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("New Parent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Platform.runLater(() -> {
            jParentPanel.removeAll();
            jParentPanel.add(jCustomFXPanel, BorderLayout.CENTER);
            jParentPanel.revalidate();
            jParentPanel.repaint();
//            add(jParentPanel, BorderLayout.CENTER);
//        });
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
