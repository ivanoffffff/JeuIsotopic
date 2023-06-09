/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fiches;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Lubos
 */
public class FAccueil extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form Accueil_Jeu_Isotopic_256
     */
    
    private FChoixJeu fichChoix;
    private FJouer fichJouer;
    private FActions fichActions;
    private FReglesJeu fichRegle;
    private FCharger fichCharger;

    
    public FAccueil() {
        //this.setLocation(470,200);
        //ici on centre notre fenetre 
        this.setTitle(" Accueil du jeu");
        initComponents();
        setLocationRelativeTo(null);
        fichChoix = new FChoixJeu(this,false);
        fichJouer = new FJouer(this,false);
        fichActions = new FActions(this,false);
        fichRegle = new FReglesJeu(this,false);
        fichCharger = new FCharger(this,false);
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
    
    public FAccueil getFichAccueil() {
        return this;
    }

    public FReglesJeu getFichRegle() {
        return fichRegle;
    }

    public FCharger getFichCharger() {
        return fichCharger;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bRègles = new javax.swing.JButton();
        bJouer = new javax.swing.JButton();
        bCharger1 = new javax.swing.JButton();
        jLabelPageAccueil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bRègles.setBackground(new java.awt.Color(153, 51, 255));
        bRègles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bRègles.setForeground(new java.awt.Color(255, 255, 255));
        bRègles.setText("Règles du jeu");
        bRègles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bRègles.setFocusable(false);
        bRègles.setMaximumSize(new java.awt.Dimension(130, 25));
        bRègles.setMinimumSize(new java.awt.Dimension(130, 25));
        bRègles.setPreferredSize(new java.awt.Dimension(130, 25));
        bRègles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRèglesActionPerformed(evt);
            }
        });
        getContentPane().add(bRègles, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 460, 160, 40));

        bJouer.setBackground(new java.awt.Color(255, 0, 255));
        bJouer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bJouer.setForeground(new java.awt.Color(255, 255, 255));
        bJouer.setText("Nouvelle partie");
        bJouer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bJouer.setFocusable(false);
        bJouer.setMaximumSize(new java.awt.Dimension(130, 25));
        bJouer.setMinimumSize(new java.awt.Dimension(130, 25));
        bJouer.setPreferredSize(new java.awt.Dimension(130, 25));
        bJouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJouerActionPerformed(evt);
            }
        });
        getContentPane().add(bJouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, 40));
        bJouer.getAccessibleContext().setAccessibleDescription("");

        bCharger1.setBackground(new java.awt.Color(102, 102, 255));
        bCharger1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bCharger1.setForeground(new java.awt.Color(255, 255, 255));
        bCharger1.setText("Charger partie");
        bCharger1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCharger1.setFocusable(false);
        bCharger1.setMaximumSize(new java.awt.Dimension(130, 25));
        bCharger1.setMinimumSize(new java.awt.Dimension(130, 25));
        bCharger1.setPreferredSize(new java.awt.Dimension(130, 25));
        bCharger1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCharger1ActionPerformed(evt);
            }
        });
        getContentPane().add(bCharger1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 40));

        jLabelPageAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Page_FAccueil.gif"))); // NOI18N
        getContentPane().add(jLabelPageAccueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRèglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRèglesActionPerformed
        // TODO add your handling code here:
        fichRegle.setVisible(true);
    }//GEN-LAST:event_bRèglesActionPerformed

    private void bJouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJouerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fichChoix.setVisible(true);
    }//GEN-LAST:event_bJouerActionPerformed

    private void bCharger1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCharger1ActionPerformed
        // TODO add your handling code here:
        /*this.setVisible(false);
        try {
            fichJouer.Init();
        } catch (IOException ex) {
            Logger.getLogger(FAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        fichActions.setVisible(true);
        fichJouer.setVisible(true);*/
        this.setVisible(false);
        fichCharger.setVisible(true);
    }//GEN-LAST:event_bCharger1ActionPerformed

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
    private javax.swing.JButton bCharger1;
    private javax.swing.JButton bJouer;
    private javax.swing.JButton bRègles;
    private javax.swing.JLabel jLabelPageAccueil;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


    
}
