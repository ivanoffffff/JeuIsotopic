/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fiches;

import pfiches.FActions;
import Fiches.FJouer;
import Fiches.FChoixJeu;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Lubos
 */
public class FAccueil extends javax.swing.JFrame  {

    /**
     * Creates new form Accueil_Jeu_Isotopic_256
     */
    
    private FChoixJeu fichChoix;
    private FJouer fichJouer;
    private FActions fichActions;

    
    public FAccueil() {
        //this.setLocation(470,200);
        //ici on centre notre fenetre 
        this.setTitle(" Accueil du jeu");
        initComponents();
        setLocationRelativeTo(null);
        fichChoix = new FChoixJeu(this,false);
        fichJouer = new FJouer(this,false);
    }

    public FJouer getFichJouer() {
        return fichJouer;
    }

    public FChoixJeu getFichChoix() {
        return fichChoix;
    }

    public FActions getFichActions() {
        return fichActions;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCharger = new javax.swing.JButton();
        bJouer = new javax.swing.JButton();
        jLabelPageAccueil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCharger.setBackground(new java.awt.Color(102, 102, 255));
        bCharger.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bCharger.setForeground(new java.awt.Color(255, 255, 255));
        bCharger.setText("Charger partie");
        bCharger.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCharger.setMaximumSize(new java.awt.Dimension(130, 25));
        bCharger.setMinimumSize(new java.awt.Dimension(130, 25));
        bCharger.setPreferredSize(new java.awt.Dimension(130, 25));
        bCharger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChargerActionPerformed(evt);
            }
        });
        getContentPane().add(bCharger, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 160, 40));

        bJouer.setBackground(new java.awt.Color(255, 0, 255));
        bJouer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bJouer.setForeground(new java.awt.Color(255, 255, 255));
        bJouer.setText("Nouvelle partie");
        bJouer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bJouer.setMaximumSize(new java.awt.Dimension(130, 25));
        bJouer.setMinimumSize(new java.awt.Dimension(130, 25));
        bJouer.setPreferredSize(new java.awt.Dimension(130, 25));
        bJouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJouerActionPerformed(evt);
            }
        });
        getContentPane().add(bJouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 160, 40));
        bJouer.getAccessibleContext().setAccessibleDescription("");

        jLabelPageAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jeu Isotopic 256.png"))); // NOI18N
        getContentPane().add(jLabelPageAccueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChargerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bChargerActionPerformed

    private void bJouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJouerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fichChoix.setVisible(true);
    }//GEN-LAST:event_bJouerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCharger;
    private javax.swing.JButton bJouer;
    private javax.swing.JLabel jLabelPageAccueil;
    // End of variables declaration//GEN-END:variables


    
}
