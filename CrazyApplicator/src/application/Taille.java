package application;

public class Taille extends Option {
   
    private int hauteur;
    private int longueur;

/////CONSTRUCTEUR//////   
    
    public Taille(float prix, String libelle, String type, int hauteur, int longueur) {
        super(prix, libelle, type);
        this.hauteur = hauteur;
        this.longueur = longueur;
    }
    
/////FONCTIONS ET METHODES/////
    
/////GETTER AND SETTER/////      

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

}
