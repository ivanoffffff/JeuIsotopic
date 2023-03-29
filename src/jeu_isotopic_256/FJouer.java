/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package jeu_isotopic_256;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lubos
 */
public class FJouer extends javax.swing.JDialog {

    /**
     * Creates new form FJouer
     */
    //private FChoixJeu fichChoix;
    private JLabel[][]tabLab;
    private int Tgrille;
    private Jouer Partie;
    private String ELmaxNom;
    //private final Icon ClassementElement[]={mm_choixjeu.png}; 
    
    public FJouer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pGrille = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout pGrilleLayout = new javax.swing.GroupLayout(pGrille);
        pGrille.setLayout(pGrilleLayout);
        pGrilleLayout.setHorizontalGroup(
            pGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        pGrilleLayout.setVerticalGroup(
            pGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(pGrille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pGrille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void Init(int Tgrille,String ElmaxNom){
        //this.addKeyListener();
        this.ELmaxNom=ElmaxNom;
        this.Tgrille=Tgrille;
        Partie=new Jouer(Tgrille);
        this.pGrille.removeAll();
        //créer le tableau de labels
        tabLab = new JLabel[Tgrille][Tgrille];
        //créer un gestionnaire de positionnement et l’associer au panel
        GridLayout gest = new GridLayout(0,Tgrille);
        pGrille.setLayout(gest);
        //créer les labels
        for (int i=0;i<Tgrille;i++){
            for (int j=0; j<Tgrille;j++){
                    
                // créer un label
                JLabel lab= new JLabel ();
                // définir la taille du label
                Dimension dim = new Dimension(150,150);
                lab.setPreferredSize(dim);
                // ajouter le label dans le tableau
                tabLab[i][j]=lab;
                // ajouter le label dans le panel
                pGrille.add(tabLab[i][j]);
            }
        }
        Partie.debuterTest(Tgrille);
        Partie.afficher(tabLab);
        //deplacement();
    }
    
    public void deplacement(){
        while(Partie.FinPartie(ELmaxNom)==false){
            
        }
    }

   
    
    
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
            java.util.logging.Logger.getLogger(FJouer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FJouer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FJouer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FJouer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FJouer dialog = new FJouer(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel pGrille;
    // End of variables declaration//GEN-END:variables
}
