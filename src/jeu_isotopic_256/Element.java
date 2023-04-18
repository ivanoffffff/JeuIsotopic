/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu_isotopic_256;

/*
 Andre Léonard
 Bosq Lucas
 Cocusse Ivan
 Groupe CB
 07/01/2023
 */

public class Element {
    
    private String NomEl;
    private long NumeroEl;
    private String image;
    //private int TempsVie;

    public Element(String NomEl, long NumeroEl) {
        this.NomEl = NomEl;
        this.NumeroEl = NumeroEl;
    }
    
    public Element(String NomEl){
        this.NomEl=NomEl;
    }

    public String toString() {
        if (NomEl.equals(" ")==true){
            return NomEl;}
        else 
            return NomEl + NumeroEl ;
    }

    public String affich(){
        if (NomEl.equals(" ")==true)
            return "/Images/El_Vide (1).png";
        else if (NomEl.equals("H")==true){
            return "/Images/H2_rond (2).png";}
        else if (NomEl.equals("He")==true)
            return "/Images/El_He4 (2).png";
        else if (NomEl.equals("O")==true)
            return "/Images/El_O16.png";
        else if (NomEl.equals("Ni")==true)
            return "/Images/El_Ni64.png";
        else if (NomEl.equals("N")==true)
            return "/Images/El_N256.png";
        else if (NomEl.equals("Ge")==true)
            return "/Images/El_Ge512.png";
        else if (NomEl.equals("Og")==true)
            return "/Images/El_Og1024.png";
        else return "";
    }

    public String getNomEl() {
        return NomEl;
    }

    public long getNumeroEl() {
        return NumeroEl;
    }
    
    
    public int getTempsVie() {
        return 0;
    }
    
    public String versFichier(){
        if (NomEl.equals("         ")==true){
            return System.lineSeparator()+NomEl;
        }
        return System.lineSeparator()+NomEl+"/"+ NumeroEl; 
    }
    
    public Element GestionTempsVie(Element El){
        return El;
    }
}