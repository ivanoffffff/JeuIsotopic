/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu_isotopic_256;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JLabel;
/*
 Andre Léonard
 Bosq Lucas
 Cocusse Ivan
 Groupe CB
 07/01/2023
 */

public class Jouer {
    
    private long Score=0;
    int Tgrille;
    private Element[][] grille;
    final static Element H=new Element("H",2);
    final static Element He=new Element("He",4);
    final static Element Be=new ElementInstable("Be",8,6);
    final static Element O=new Element("O",16);
    final static Element P=new ElementInstable("P",32,24);
    final static Element Ni=new Element("Ni",64);
    final static Element Sn=new ElementInstable("Sn",128,96);
    final static Element N=new Element("N",256);
    final static Element Ge=new Element("Ge",512);
    final static Element Og=new Element("Og",1024);
    final static Element vide =new Element(" ");
    String ElMaxNom;
    private final static Element ClassementElement[]={H,He,Be,O,P,Ni,Sn,N,Ge,Og}; 

/* constructeur de la classe jouer qui permet de créer une grille vide à 
partir d'un tableau de taille Tgrille pouvant contenir des éléments*/
    public Jouer(int Tgrille) {
        this.Tgrille=Tgrille;
        grille=new Element[Tgrille][Tgrille];
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                grille[i][j]=vide;
            }
        }
    }
    
/*Constructeur appelé lorsque le joueuer décide de charger une partie*/
    public Jouer() {
    }
    
    public int getTgrille() {
        return Tgrille;
    }
    
    public long getScore() {
        return Score;
    }
     
/*Cette méthode qui prend en entrer la taille de la grille en entrée et permet 
de placer un élément He et H aléatoirement sur la grille de jeu*/
    public void debuter(int Tgrille,String ElMaxNom){
        this.ElMaxNom=ElMaxNom;
        Random line = new Random();
        int nbTuileDebut=2;
        for(int i=0;i<nbTuileDebut;i++){
            int x=line.nextInt(Tgrille);
            int y=line.nextInt(Tgrille);
            if (verifVide(x,y)==true){
                if (i==0)
                    grille[x][y]=H;
                else if (i==1)
                    grille[x][y]=He;
            }
            else
                i=i-1;
        }
        Score=0;
    }
/*Méthode débuter appelée lorsque l'utilisateur souhaite charger une partie*/
    public void debuter(String NomJoueur) throws IOException{
        ChargerPartie(NomJoueur);
    }

/*Méthode créée pour effectuer des tests sur la grille lors de la création
du programme*/    
    public void debuterTest(int Tgrille){
        grille[0][0]=H;
        grille[1][0]=He;
        grille[2][0]=Sn;
        grille[1][1]=P;
        grille[2][2]=Be;
        grille[0][2]=P;
        grille[0][1]=Ge;
        grille[1][2]=O;
        Score=0;
    }

/*Méthode permettant d'afficher la grille à partir du tableau d'éléments dans 
la console*/
    public void afficher(){
        System.out.println();
        for (int i=0;i<grille.length;i++){
            System.out.print(" | ");
            for (int k=0;k<grille[i].length;k++){
                System.out.print(grille[i][k]+" | ");
            }
            System.out.println();
        }
        System.out.println();
    }

/*Méthode permettant d'afficher la grille sous forme de JLabel à partir du 
tableau d'éléments dans l'inteface graphique*/
     public void afficher(JLabel [][]tablab){
        for (int i=0;i<tablab.length;i++){
            for (int k=0;k<tablab[i].length;k++){
                tablab[i][k].setIcon(null);
                tablab[i][k].setText(null);
                tablab[i][k].setIcon(new javax.swing.ImageIcon(getClass().getResource((grille[i][k].affich()))));
                if (grille[i][k].getNumeroEl()==8||grille[i][k].getNumeroEl()==32||grille[i][k].getNumeroEl()==128){
                    tablab[i][k].setText(String.valueOf(grille[i][k].getTempsVie()));
                }
            }
        }
    }
 
/*Méthode permettant de vérifier si une case est vide*/ 
    public boolean verifVide(int a,int b){
        return grille[a][b].equals(vide);
    }
 
/*Méthode qui permet de vérifier q'un déplacement de l'élément est possible
dans tous les sens de déplacement*/
    public boolean verifAdjacente(int a, int b, String direction){
        if (direction.equals("D")==true){
            return !verifVide(a,b+1);
        }
        else if (direction.equals("Q")==true){
            return !verifVide(a,b-1);
        }
        else if (direction.equals("Z")==true){
            return !verifVide(a-1,b);
        }
        else{
            return !verifVide(a+1,b);
        }
    }

    
    public boolean deplacerG(){
        boolean deplacement=false;
        for (int j=0;j<Tgrille;j++){
            for (int i=0;i<Tgrille;i++){
                if (verifVide(j,i)==false){
                    for (int k=i;k>0;k--){
                        if (verifAdjacente(j,k,"Q")==false){
                            grille[j][k-1]=grille[j][k];
                            grille[j][k]=vide;
                            deplacement=true;
                        }
                    }
                }
            }
        }
        return deplacement;
    }
    
    public boolean deplacerD(){
        boolean deplacement=false;
        for (int j=0;j<Tgrille;j++){
            for (int i=Tgrille-1;i>=0;i--){
                if (verifVide(j,i)==false){
                    for (int k=i;k<Tgrille-1;k++){
                        if (verifAdjacente(j,k,"D")==false){
                            grille[j][k+1]=grille[j][k];
                            grille[j][k]=vide;
                            deplacement=true;
                        }
                    }
                }
            }
        }
        return deplacement;
    }
    
    public boolean deplacerB(){
        boolean deplacement=false;
        for (int j=Tgrille-1;j>=0;j--){
            for (int i=0;i<Tgrille;i++){
                if (verifVide(j,i)==false){
                    for (int k=j;k<Tgrille-1;k++){
                        if (verifAdjacente(k,i,"S")==false){
                            grille[k+1][i]=grille[k][i];
                            grille[k][i]=vide;
                            deplacement=true;
                        }
                    }
                }
            }
        }
        return deplacement;
    }
    
    public boolean deplacerH(){
        boolean deplacement=false;
        for (int j=0;j<Tgrille;j++){
            for (int i=0;i<Tgrille;i++){
                if (verifVide(j,i)==false){
                    for (int k=j;k>0;k--){
                        if (verifAdjacente(k,i,"Z")==false){
                            grille[k-1][i]=grille[k][i];
                            grille[k][i]=vide;
                            deplacement=true;
                        }
                    }
                }
            }
        }
        return deplacement;
    }
    
    public boolean fusionG(){
        boolean fusion=false;
        for (int j=0;j<Tgrille;j++){
            for (int i=0;i<Tgrille-1;i++){
                if (verifVide(j,i)==false){
                    if (grille[j][i].getNomEl().equals(grille[j][i+1].getNomEl())){
                        for (int k=0;k<ClassementElement.length-1;k++){
                            if (grille[j][i].getNomEl().equals(ClassementElement[k].getNomEl())){
                                grille[j][i+1]=ClassementElement[k+1];
                                grille[j][i]=vide;
                                fusion=true;
                                long ScoreinterG=ClassementElement[k+1].getNumeroEl();
                                Score=Score+ScoreinterG;
                                //System.out.println("fusion");
                            }
                        }
                    }
                }
            }
        }
        return fusion;
    }
    
    public boolean fusionD(){
        boolean fusion=false;
        for (int j=0;j<Tgrille;j++){
            for (int i=Tgrille-1;i>0;i--){
                if (verifVide(j,i)==false){
                    if (grille[j][i].getNomEl().equals(grille[j][i-1].getNomEl())){
                        for (int k=0;k<ClassementElement.length-1;k++){
                            if (grille[j][i].getNomEl().equals(ClassementElement[k].getNomEl())){
                                grille[j][i-1]=ClassementElement[k+1];
                                grille[j][i]=vide;
                                fusion=true;
                                long ScoreinterD=ClassementElement[k+1].getNumeroEl();
                                Score=Score+ScoreinterD;
                                //System.out.println("fusion");
                            }
                        }
                    }
                }
            }
        }
        return fusion;
    }
    
    public boolean fusionB(){
        boolean fusion=false;
        for (int j=Tgrille-1;j>0;j--){
            for (int i=0;i<Tgrille;i++){
                if (verifVide(j,i)==false){
                    if (grille[j][i].getNomEl().equals(grille[j-1][i].getNomEl())){
                        for (int k=0;k<ClassementElement.length-1;k++){
                            if (grille[j][i].getNomEl().equals(ClassementElement[k].getNomEl())){
                                grille[j-1][i]=ClassementElement[k+1];
                                grille[j][i]=vide;
                                fusion=true;
                                long ScoreinterB=ClassementElement[k+1].getNumeroEl();
                                Score=Score+ScoreinterB;
                                //System.out.println("fusion");
                            }
                        }
                    }
                }
            }
        }
        return fusion;
    }
    
    public boolean fusionH(){
        boolean fusion=false;
        for (int j=0;j<Tgrille-1;j++){
            for (int i=0;i<Tgrille;i++){
                if (verifVide(j,i)==false){
                    if (grille[j][i].getNomEl().equals(grille[j+1][i].getNomEl())){
                        for (int k=0;k<ClassementElement.length-1;k++){
                            if (grille[j][i].getNomEl().equals(ClassementElement[k].getNomEl())){
                                grille[j+1][i]=ClassementElement[k+1];
                                grille[j][i]=vide;
                                fusion=true;
                                long ScoreinterH=ClassementElement[k+1].getNumeroEl();
                                Score=Score+ScoreinterH;
                                //System.out.println("fusion");
                            }
                        }
                    }
                }
            }
        }
        return fusion;
    }

/*Méthode permettant la gestion des déplacements,des fusions simples et des 
fusions en cascade en fonction du choix de direction du joueur*/
    public boolean AplDeplacementFusion(String direction){
        boolean deplacement=true;
        boolean fusion=true;
        int nbChangements=0;
        switch (direction) {
            case "Q" -> {
                while (fusion==true){
                    deplacement=deplacerG();
                    if(deplacement==true){
                        nbChangements+=1;
                    }
                    fusion=fusionG();
                    if(fusion==true){
                        nbChangements+=1;
                    }
                }
            }
            case "D" -> {
                while (fusion==true){
                    deplacement=deplacerD();
                    if(deplacement==true){
                        nbChangements+=1;}
                    fusion=fusionD();
                    if(fusion==true){
                        nbChangements+=1;
                    }
                }
            }
            case "Z" -> {
                while (deplacement==true||fusion==true){
                    deplacement=deplacerH();
                    if(deplacement==true){
                        nbChangements+=1;
                    }
                    fusion=fusionH();
                    if(fusion==true){
                        nbChangements+=1;
                    }
                }
            }
            case "S" -> {
                while (deplacement==true||fusion==true){
                    deplacement=deplacerB();
                    if(deplacement==true){
                        nbChangements+=1;
                    }
                    fusion=fusionB();
                    if(fusion==true){
                        nbChangements+=1;
                    }
                }
            }
            default -> {
            }
        }
        
        if(nbChangements==0){
            return false;
        }
        
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                grille[i][j]=grille[i][j].GestionTempsVie(grille[i][j]);
            }
        }
        
        ajoutElement();
        return true;
    }
/*Méthode qui ajoute un élément He ou H aléatoirement dans la grille à chaque
tour de jeu */    
    public void ajoutElement(){
        Random line = new Random();
        Random ElAjout= new Random();
        int z=ElAjout.nextInt(2);
        boolean ajout=false;
        while (ajout==false){
            int x=line.nextInt(Tgrille);
            int y=line.nextInt(Tgrille);
            if (verifVide(x,y)==true){
                if (z==1){
                    grille[x][y]=H;
                    ajout =true;
                }
                else{
                    grille[x][y]=He;
                    ajout=true;
                }
            }
        }
    }

/* Méthode qui permet de créer un fichier texte avec le nom du joueur et de 
sauvegarder les informations de la partie (2lément max, taille, score, grille*/    
    public void SavePartie(String max, String NomJoueur) throws IOException{
        
        FileWriter Sauv=new FileWriter("Sauv."+NomJoueur+".txt");
        Sauv.write(max+"/"+Tgrille+"/"+Score);
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                String ElSauv=grille[i][j].versFichier();
                Sauv.write(ElSauv);
            }
        }   
        Sauv.close();
    }
/* Méthode qui permet de lire les informations contenues dans le fichier
texte afin de pouvoir charger une partie commencée */ 
    public String ChargerPartie(String NomJoueur) throws IOException{
        FileReader Sauv=new FileReader("Sauv."+NomJoueur+".txt");
        BufferedReader br=new BufferedReader(Sauv);
        String ligne1=br.readLine();
        String[]tab=ligne1.split("/");
        ElMaxNom=tab[0];
        Tgrille=Integer.parseInt(tab[1]);
        Score=Integer.parseInt(tab[2]);
        grille=new Element[Tgrille][Tgrille];
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                grille[i][j]=null;
            }
        }
        String ligne=br.readLine();
        Element El=vide;
        while(ligne!=null){
            String[]tabEl=ligne.split("/");
            if (tabEl[0].equals(" ")){
                El=vide;
            }
            else if(tabEl.length==3){
                int numeroEl=Integer.parseInt(tabEl[1]);
                int tempsVie=Integer.parseInt(tabEl[2]);
                El=new ElementInstable(tabEl[0],numeroEl,tempsVie);
            }
            else{
                int numeroEl=Integer.parseInt(tabEl[1]);
                El=new Element(tabEl[0],numeroEl);
            }
            for (int j=0;j<Tgrille;j++){
                for (int k=0;k<Tgrille;k++){
                    if (grille[j][k]==null){
                        grille[j][k]=El;
                        j=Tgrille-1;
                        k=Tgrille-1;
                    }
                }
            }
            ligne=br.readLine();
        }
        Sauv.close();
        return ElMaxNom;
    }
    
    public boolean deplacementPossible(){
        for (int j=0;j<Tgrille;j++){
            for (int i=0;i<Tgrille-1;i++){
                if (grille[j][i].getNomEl().equals(grille[j][i+1].getNomEl())){
                    return true;
                }
            }
        }
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille-1;j++){
                if (grille[j][i].getNomEl().equals(grille[j+1][i].getNomEl())){
                    return true;
                }
            }
        }
        return false;
    }
    

    public String FinPartie(){
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                if (grille[i][j].getNomEl().equals(ElMaxNom)){
                    return "WIN";
                }
            }
        }
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                if (grille[i][j].getNomEl().compareTo(vide.getNomEl())==0){
                    return "CONTINUE";
                }
            }
        }
        if (deplacementPossible()==false){
            return "LOSE";
        }
        return "CONTINUE";
        
    }

   
    
    
}