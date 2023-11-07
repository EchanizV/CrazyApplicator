package application;

public class Personnalisation extends Option {
    
    private String textPerso;

/////CONSTRUCTEUR//////    
    
    public Personnalisation(float prix, String libelle, String type, String textPerso) {
        super(prix, libelle, type);
        this.textPerso = textPerso;
    }

/////FONCTIONS ET METHODES/////
    
/////GETTER AND SETTER/////      
    
    public String getTextPerso() {
        return textPerso;
    }

    public void setTextPerso(String textPerso) {
        this.textPerso = textPerso;
    }

}
