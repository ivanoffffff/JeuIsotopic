/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Fiches;

import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author Lubos
 */
public class FChoixJeu extends javax.swing.JDialog {

    /**
     * Creates new form FJouer
     */
    
    //private FJouer fichJouer;
    private int Elmax=256;
    private int Tgrille;
    private String ElmaxNom="N";
    private String NomJoueur;
    
    public FChoixJeu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE );
        setLocationRelativeTo(null);
        this.setTitle("CHOIX DU JOUEUR");
        jErreur.setVisible(false);
        RadioBouton4x4.setOpaque(false);
        RadioBouton3x3.setOpaque(false);
        RadioBouton5x5.setOpaque(false);
        RadioBouton6x6.setOpaque(false);
        RadioBoutonSn128.setOpaque(false);
        RadioBoutonN256.setOpaque(false);
        RadioBoutonGe512.setOpaque(false);
        RadioBouttonOg1024.setOpaque(false);
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),50,50));
    }
    
    
    private int TgrilleSelect(){ //permet de savoir quelle taille de grille l'utilisateur a choisi
        if (RadioBouton3x3.isSelected())
            Tgrille=3;
        
        else if(RadioBouton4x4.isSelected())
            Tgrille=4;
        
        else if(RadioBouton5x5.isSelected())
            Tgrille=5;
        
        else if(RadioBouton6x6.isSelected())
            Tgrille=6;
        return Tgrille;
    }
    
    private int ElmaxSelect(){ //  permet de savoir quel élément max l'utilisteur a choisi
        if (RadioBoutonSn128.isSelected())
            Elmax=128;
        
        else if(RadioBoutonN256.isSelected())
            Elmax=256;
        
        else if(RadioBoutonGe512.isSelected())
            Elmax=512;
        else if(RadioBouttonOg1024.isSelected())
            Elmax=1024;

        return Elmax;
    }
    
    public String getNomJoueur(){
        return NomJoueur;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupeTaille = new javax.swing.ButtonGroup();
        bGroupeEl = new javax.swing.ButtonGroup();
        bRetour = new javax.swing.JButton();
        jPanelBoutonTgrille = new javax.swing.JPanel();
        RadioBouton4x4 = new javax.swing.JRadioButton();
        RadioBouton3x3 = new javax.swing.JRadioButton();
        RadioBouton6x6 = new javax.swing.JRadioButton();
        RadioBouton5x5 = new javax.swing.JRadioButton();
        bJouer = new javax.swing.JButton();
        jPanelBoutonElmax = new javax.swing.JPanel();
        RadioBoutonN256 = new javax.swing.JRadioButton();
        RadioBoutonSn128 = new javax.swing.JRadioButton();
        RadioBoutonGe512 = new javax.swing.JRadioButton();
        RadioBouttonOg1024 = new javax.swing.JRadioButton();
        JPseudo = new javax.swing.JTextField();
        jErreur = new javax.swing.JLabel();
        jLabelIntermediaire = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().add(bRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 40));

        jPanelBoutonTgrille.setForeground(java.awt.SystemColor.menu);
        jPanelBoutonTgrille.setOpaque(false);

        bGroupeTaille.add(RadioBouton4x4);
        RadioBouton4x4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBouton4x4.setSelected(true);
        RadioBouton4x4.setText("4x4");
        RadioBouton4x4.setBorder(null);
        RadioBouton4x4.setFocusable(false);
        RadioBouton4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBouton4x4ActionPerformed(evt);
            }
        });

        bGroupeTaille.add(RadioBouton3x3);
        RadioBouton3x3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBouton3x3.setText("3x3");
        RadioBouton3x3.setBorder(null);
        RadioBouton3x3.setFocusable(false);
        RadioBouton3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBouton3x3ActionPerformed(evt);
            }
        });

        bGroupeTaille.add(RadioBouton6x6);
        RadioBouton6x6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBouton6x6.setText("6x6");
        RadioBouton6x6.setBorder(null);
        RadioBouton6x6.setFocusable(false);
        RadioBouton6x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBouton6x6ActionPerformed(evt);
            }
        });

        bGroupeTaille.add(RadioBouton5x5);
        RadioBouton5x5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBouton5x5.setText("5x5");
        RadioBouton5x5.setBorder(null);
        RadioBouton5x5.setFocusable(false);
        RadioBouton5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBouton5x5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBoutonTgrilleLayout = new javax.swing.GroupLayout(jPanelBoutonTgrille);
        jPanelBoutonTgrille.setLayout(jPanelBoutonTgrilleLayout);
        jPanelBoutonTgrilleLayout.setHorizontalGroup(
            jPanelBoutonTgrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoutonTgrilleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioBouton3x3)
                .addGap(18, 18, 18)
                .addComponent(RadioBouton4x4)
                .addGap(18, 18, 18)
                .addComponent(RadioBouton5x5)
                .addGap(18, 18, 18)
                .addComponent(RadioBouton6x6)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelBoutonTgrilleLayout.setVerticalGroup(
            jPanelBoutonTgrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBoutonTgrilleLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanelBoutonTgrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBouton4x4)
                    .addComponent(RadioBouton3x3)
                    .addComponent(RadioBouton6x6)
                    .addComponent(RadioBouton5x5))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanelBoutonTgrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 360, 80));

        bJouer.setBackground(new java.awt.Color(102, 102, 255));
        bJouer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bJouer.setForeground(new java.awt.Color(255, 255, 255));
        bJouer.setText("Lancer partie");
        bJouer.setFocusable(false);
        bJouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJouerActionPerformed(evt);
            }
        });
        getContentPane().add(bJouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, 40));

        jPanelBoutonElmax.setForeground(java.awt.SystemColor.menu);
        jPanelBoutonElmax.setOpaque(false);

        bGroupeEl.add(RadioBoutonN256);
        RadioBoutonN256.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBoutonN256.setSelected(true);
        RadioBoutonN256.setText("N 256");
        RadioBoutonN256.setBorder(null);
        RadioBoutonN256.setFocusable(false);
        RadioBoutonN256.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBoutonN256ActionPerformed(evt);
            }
        });

        bGroupeEl.add(RadioBoutonSn128);
        RadioBoutonSn128.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBoutonSn128.setText("Sn 128");
        RadioBoutonSn128.setBorder(null);
        RadioBoutonSn128.setFocusable(false);
        RadioBoutonSn128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBoutonSn128ActionPerformed(evt);
            }
        });

        bGroupeEl.add(RadioBoutonGe512);
        RadioBoutonGe512.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBoutonGe512.setText("Ge 512");
        RadioBoutonGe512.setBorder(null);
        RadioBoutonGe512.setFocusable(false);
        RadioBoutonGe512.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBoutonGe512ActionPerformed(evt);
            }
        });

        bGroupeEl.add(RadioBouttonOg1024);
        RadioBouttonOg1024.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        RadioBouttonOg1024.setText("Og 1024");
        RadioBouttonOg1024.setBorder(null);
        RadioBouttonOg1024.setFocusable(false);
        RadioBouttonOg1024.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBouttonOg1024ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBoutonElmaxLayout = new javax.swing.GroupLayout(jPanelBoutonElmax);
        jPanelBoutonElmax.setLayout(jPanelBoutonElmaxLayout);
        jPanelBoutonElmaxLayout.setHorizontalGroup(
            jPanelBoutonElmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoutonElmaxLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(RadioBoutonSn128)
                .addGap(18, 18, 18)
                .addComponent(RadioBoutonN256)
                .addGap(18, 18, 18)
                .addComponent(RadioBoutonGe512)
                .addGap(18, 18, 18)
                .addComponent(RadioBouttonOg1024)
                .addContainerGap())
        );
        jPanelBoutonElmaxLayout.setVerticalGroup(
            jPanelBoutonElmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBoutonElmaxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBoutonElmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBoutonN256)
                    .addComponent(RadioBoutonSn128)
                    .addComponent(RadioBoutonGe512)
                    .addComponent(RadioBouttonOg1024))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanelBoutonElmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 530, 80));

        JPseudo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JPseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPseudoActionPerformed(evt);
            }
        });
        getContentPane().add(JPseudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 105, 140, 30));

        jErreur.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jErreur.setForeground(new java.awt.Color(204, 0, 0));
        jErreur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Attention2.png"))); // NOI18N
        jErreur.setText("️Veuillez entrer un pseudo !!");
        getContentPane().add(jErreur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 135, 330, 50));

        jLabelIntermediaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fond_FChoix_.gif"))); // NOI18N
        getContentPane().add(jLabelIntermediaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetourActionPerformed
        // TODO add your handling code here:
        this.getParent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bRetourActionPerformed

    private void RadioBouton4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBouton4x4ActionPerformed
    }//GEN-LAST:event_RadioBouton4x4ActionPerformed

    private void RadioBouton3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBouton3x3ActionPerformed
    }//GEN-LAST:event_RadioBouton3x3ActionPerformed

    private void RadioBouton6x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBouton6x6ActionPerformed
    }//GEN-LAST:event_RadioBouton6x6ActionPerformed

    private void bJouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJouerActionPerformed
        NomJoueur = JPseudo.getText();
        if (NomJoueur.equals("")){
            jErreur.setVisible(true);
        }
        else{
            jErreur.setVisible(false);
            Tgrille=TgrilleSelect();
            Elmax=ElmaxSelect();
            switch (Elmax) {
                case 128 -> ElmaxNom="Sn";
                case 256 -> ElmaxNom="N";
                case 512 -> ElmaxNom="Ge";
                case 1024 -> ElmaxNom="Og";
                default -> {
                }
            }

            int retour= JOptionPane.showConfirmDialog(this,"Vous avez choisi une grille "+Tgrille+"x"+Tgrille+" et l'élément "+ElmaxNom+Elmax+" à atteindre ","Confirmation choix",YES_NO_OPTION);

            if (retour==YES_OPTION){
                FJouer f=((FAccueil)getParent()).getFichJouer();
                FActions fAct=((FAccueil)getParent()).getFichActions();
                f.Init(Tgrille,ElmaxNom);
                this.setVisible(false);
                fAct.setVisible(true);
                f.setVisible(true);
            }
        }

    }//GEN-LAST:event_bJouerActionPerformed

    private void RadioBoutonN256ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBoutonN256ActionPerformed

    }//GEN-LAST:event_RadioBoutonN256ActionPerformed

    private void RadioBoutonSn128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBoutonSn128ActionPerformed

    }//GEN-LAST:event_RadioBoutonSn128ActionPerformed

    private void RadioBoutonGe512ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBoutonGe512ActionPerformed

    }//GEN-LAST:event_RadioBoutonGe512ActionPerformed

    private void RadioBouttonOg1024ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBouttonOg1024ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBouttonOg1024ActionPerformed

    private void RadioBouton5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBouton5x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBouton5x5ActionPerformed

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
            java.util.logging.Logger.getLogger(FChoixJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FChoixJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FChoixJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FChoixJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FChoixJeu dialog = new FChoixJeu(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField JPseudo;
    private javax.swing.JRadioButton RadioBouton3x3;
    private javax.swing.JRadioButton RadioBouton4x4;
    private javax.swing.JRadioButton RadioBouton5x5;
    private javax.swing.JRadioButton RadioBouton6x6;
    private javax.swing.JRadioButton RadioBoutonGe512;
    private javax.swing.JRadioButton RadioBoutonN256;
    private javax.swing.JRadioButton RadioBoutonSn128;
    private javax.swing.JRadioButton RadioBouttonOg1024;
    private javax.swing.ButtonGroup bGroupeEl;
    private javax.swing.ButtonGroup bGroupeTaille;
    private javax.swing.JButton bJouer;
    private javax.swing.JButton bRetour;
    private javax.swing.JLabel jErreur;
    private javax.swing.JLabel jLabelIntermediaire;
    private javax.swing.JPanel jPanelBoutonElmax;
    private javax.swing.JPanel jPanelBoutonTgrille;
    // End of variables declaration//GEN-END:variables
}
