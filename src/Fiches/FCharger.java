/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Fiches;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan5
 */
public class FCharger extends javax.swing.JDialog {

    /**
     * Creates new form FCharger
     */
    
    private String NomJoueurCharge;
    
    public FCharger(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        
        
    }

    public String getNomJoueurCharge() {
        return NomJoueurCharge;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bRetour = new javax.swing.JButton();
        bCharger1 = new javax.swing.JButton();
        JPseudo = new javax.swing.JTextField();
        JFondCharger = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bRetour.setBackground(new java.awt.Color(255, 0, 255));
        bRetour.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bRetour.setForeground(new java.awt.Color(255, 255, 255));
        bRetour.setText("Retour");
        bRetour.setFocusable(false);
        bRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetourActionPerformed(evt);
            }
        });
        getContentPane().add(bRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        bCharger1.setBackground(new java.awt.Color(102, 102, 255));
        bCharger1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bCharger1.setForeground(new java.awt.Color(255, 255, 255));
        bCharger1.setText("Charger");
        bCharger1.setActionCommand("Charger");
        bCharger1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bCharger1.setFocusable(false);
        bCharger1.setMaximumSize(new java.awt.Dimension(130, 25));
        bCharger1.setMinimumSize(new java.awt.Dimension(130, 25));
        bCharger1.setPreferredSize(new java.awt.Dimension(130, 25));
        bCharger1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCharger1ActionPerformed(evt);
            }
        });
        getContentPane().add(bCharger1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, 40));

        JPseudo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JPseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPseudoActionPerformed(evt);
            }
        });
        getContentPane().add(JPseudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, 30));

        JFondCharger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fond_FActions.gif"))); // NOI18N
        getContentPane().add(JFondCharger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetourActionPerformed
        // TODO add your handling code here:
        this.getParent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bRetourActionPerformed

    private void bCharger1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCharger1ActionPerformed
        // TODO add your handling code here:
        NomJoueurCharge = JPseudo.getText();
        if (JPseudo.getText()==null){
            JOptionPane.showMessageDialog(this, "Veuillez entrer un pseudo valide");
        }
        FJouer fJouer=((FAccueil)getParent()).getFichJouer();
        FActions fActions=((FAccueil)getParent()).getFichActions();
        this.setVisible(false);
        try {
            fJouer.Init();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FCharger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        fActions.setVisible(true);
        fJouer.setVisible(true);
    }//GEN-LAST:event_bCharger1ActionPerformed

    private void JPseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPseudoActionPerformed

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
            java.util.logging.Logger.getLogger(FCharger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCharger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCharger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCharger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FCharger dialog = new FCharger(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondCharger;
    private javax.swing.JTextField JPseudo;
    private javax.swing.JButton bCharger1;
    private javax.swing.JButton bRetour;
    // End of variables declaration//GEN-END:variables

    
}
