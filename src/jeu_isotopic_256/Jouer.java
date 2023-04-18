/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu_isotopic_256;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
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
    private final static String PartieSauv="PartieSauv.txt";
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

    public Jouer(int Tgrille) {
        this.Tgrille=Tgrille;
        grille=new Element[Tgrille][Tgrille];
        for (int i=0;i<Tgrille;i++){
            for (int j=0;j<Tgrille;j++){
                grille[i][j]=vide;
            }
        }
    }
    
    public Jouer() {
    }
    

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
    
    public void debuter(String NomJoueur) throws IOException{
        ChargerPartie(NomJoueur);
    }
    
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
    
    public boolean verifVide(int a,int b){
        if (grille[a][b].equals(vide))
            return true;
        else
            return false;
    }
    
    public boolean verifAdjacente(int a, int b, String direction){
        if (direction.equals("D")==true){
            if (verifVide(a,b+1)){
                return false;
            }
            else 
                return true;
        }
        else if (direction.equals("Q")==true){
            if (verifVide(a,b-1)){
                return false;
            }
            else 
                return true;
        }
        else if (direction.equals("Z")==true){
            if (verifVide(a-1,b)){
                return false;
            }
            else 
                return true;
        }
        else{
            if (verifVide(a+1,b)){
                return false;
            }
            else 
                return true;
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
    
    public long Score(long Sc){
        Score=Score+Sc;
        return Score;
    }

    public long getScore() {
        return Score;
    }

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
 
    public String ChargerPartie(String NomJoueur) throws FileNotFoundException, IOException{
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

    public int getTgrille() {
        return Tgrille;
    }
    
    
}