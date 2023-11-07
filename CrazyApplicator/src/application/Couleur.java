package application;

public class Couleur extends Option {

    
    private String couleur;

/////CONSTRUCTEUR//////   
    
    public Couleur(float prix, String libelle, String type, String couleur) {
        super(prix, libelle, type);
        this.couleur = couleur;
    }
    
    
/////FONCTIONS ET METHODES/////
    
/////GETTER AND SETTER/////      
    
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }






}

