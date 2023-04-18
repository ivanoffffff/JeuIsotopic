/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu_isotopic_256;

import static jeu_isotopic_256.Jouer.vide;

/*
 Andre Léonard
 Bosq Lucas
 Cocusse Ivan
 Groupe CB
 07/01/2023
 */

public class ElementInstable extends Element {

    private int TempsVie;
    private String NomEl;
    
    public ElementInstable(String NomEl, int NumeroEl,int TempsVie) {
        super(NomEl, NumeroEl);
        this.NomEl=NomEl;
        this.TempsVie=TempsVie;
    }

    public String toString() {
        return super.toString()+"("+(TempsVie)+")";
    }
    
    public String toString2() {
        return "("+(TempsVie)+")";
    }
    
    public String affich(){
        if (NomEl.equals("Be")==true)
            return "/Images/El_Be8.png";
        else if (NomEl.equals("P")==true)
            return "/Images/El_P32.png";
        else if (NomEl.equals("Sn")==true)
            return "/Images/El_Sn128.png";
        return "";
    }
    
    public int getTempsVie() {
        return TempsVie;
    }
    
    public String versFichier(){
        return super.versFichier()+"/"+TempsVie;   
    }
    
    public Element GestionTempsVie(Element El){
        switch (El.getNomEl()) {
                    case "Be" ->                         {
                            int tempVie=El.getTempsVie();
                            //System.out.println(tempVie);
                            if (tempVie==1)
                                El=vide;
                            else
                                El=new ElementInstable("Be",8,tempVie-1);
                        }
                    case "P" ->                         {
                            int tempVie=El.getTempsVie();
                            //System.out.println(tempVie);
                            if (tempVie==1)
                                El=vide;
                            else
                                El=new ElementInstable("P",32,tempVie-1);
                        }
                    case "Sn" ->                         {
                            int tempVie=El.getTempsVie();
                            //System.out.println(tempVie);
                            if (tempVie==1)
                                El=vide;
                            else
                                El=new ElementInstable("Sn",128,tempVie-1);
                        }
                    default -> {
                    }
                }
        return El;
    }

}