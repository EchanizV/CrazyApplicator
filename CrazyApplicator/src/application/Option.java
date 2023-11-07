package application;

import javafx.scene.paint.Color;

public class Option {

    private float prix;
    private String libelle;
    private String type;

/////CONSTRUCTEUR//////    
    
    public Option(float prix, String libelle, String type) {
        this.prix = prix;
        this.libelle = libelle;
        this.type = type;
    }
    
/////FONCTIONS ET METHODES/////

/////GETTER AND SETTER/////    
    
    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }





}
